package com.volfam.barska

import android.content.Context
import com.volfam.barska.data.Training
import java.text.SimpleDateFormat
import java.util.*

const val TWO_HOURS_IN_MILLIS = 7_200_000

fun trainingToShareIntentText(context: Context, training: Training): String {
    return context.getString(
        R.string.share_intent_text,
        formatDate(context, training.date),
        formatStartEndTime(training.date),
        training.group,
        training.trainer.trainerWithPrefix(context),
        training.place,
        training.price.formatPrice(context)
    )
}

fun Int.formatPrice(context: Context): String {
    return if (this == 0) context.getString(R.string.free_of_charge_label)
    else context.getString(R.string.price_formatter, this)
}

fun String.trainerWithPrefix(ctx: Context): String {
    if (this == ctx.getString(R.string.no_trainer_label)) return this
    return "Тренер: $this"
}

fun formatDateTime(ctx: Context, millis: Long): String {
    return "${formatDate(ctx, millis)}, ${formatStartEndTime(millis)}"
}

fun formatDate(ctx: Context, millis: Long): String {
    val calendar = Calendar.getInstance()
    calendar.timeInMillis = millis
    val months = ctx.resources.getStringArray(R.array.months)
    val month = months[calendar.get(Calendar.MONTH)]
    val weekDays = ctx.resources.getStringArray(R.array.week_days_short)
    val weekDay = weekDays[calendar.get(Calendar.DAY_OF_WEEK) - 1]
    return "$weekDay, ${calendar.get(Calendar.DAY_OF_MONTH)} $month"
}

fun formatStartEndTime(millis: Long): String {
    val formatter = SimpleDateFormat("HH:mm", Locale.getDefault())
    return "${formatter.format(millis)} - ${formatter.format(millis + TWO_HOURS_IN_MILLIS)}"
}

fun formatStartTime(ctx: Context, millis: Long): String {
    val formatter = SimpleDateFormat("HH:mm", Locale.getDefault())
    return ctx.getString(R.string.starttime_with_label, formatter.format(millis))
}

fun String.shortenPlaceString(): String {
    val pattern = "[0-9]".toRegex()
    val index = pattern.find(this)?.range?.last
    val shortString = index?.let {
        this.substring(0, it)
    }
    return shortString ?: this
}

fun String.breaklinePlaceString(): String {
    val pattern = "\\d+\\s".toRegex()
    val index = pattern.find(this)?.range?.last
    val result = index?.let {
        val first = substring(0, it)
        val second = substring(it + 1, length)
        listOf(first, second)
    }
    return result?.joinToString("\n") ?: this
}

fun String.shortenTrainerName(context: Context): String {
    if (this == context.getString(R.string.no_trainer_label)) return this
    return substringBefore(" ")
}