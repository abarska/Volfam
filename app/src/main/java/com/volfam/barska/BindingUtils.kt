package com.volfam.barska

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.volfam.barska.data.Training
import timber.log.Timber

@BindingAdapter("trainer_image")
fun ImageView.setTrainerImage(trainer: String?) {
    trainer?.let {
        setImageResource(
            when (it) {
                context.getString(R.string.trainer_label_smugilev) -> R.drawable.smugiljov_cropped
                context.getString(R.string.trainer_label_sokolovskaya) -> R.drawable.sokolovskaya_cropped
                context.getString(R.string.no_trainer_label) -> R.drawable.logo_icon
                else -> R.drawable.ic_person_black_80dp
            }
        )
    }
}

@BindingAdapter("formatted_date_time")
fun TextView.setFormattedDateTime(date: Long?) {
    text = formatDateTime(context, date ?: 0)
}

@BindingAdapter("group_with_label")
fun TextView.setGroupWithLabel(group: String?) {
    text = context.getString(R.string.group_with_label, group ?: "")
}

@BindingAdapter("trainer_shortened_with_label")
fun TextView.setTrainerShortenedWithLabel(trainer: String?) {
    trainer?.let {
        val shortened = trainer.shortenTrainerName(context)
        Timber.i("shortened = $shortened")
        text = context.getString(R.string.trainer_with_label, shortened)
    }
}

@BindingAdapter("formatted_date")
fun TextView.setFormattedDate(date: Long?) {
    text = formatDate(context, date ?: 0)
}

@BindingAdapter("formatted_start_time")
fun TextView.setFormattedStartTime(date: Long?) {
    text = formatStartTime(context, date ?: 0)
}

@BindingAdapter("formatted_group_price")
fun TextView.setFormattedGroupPrice(training: Training?) {
    training?.let {
        text = context.getString(
            R.string.group_price_formatter,
            training.group,
            training.price.formatPrice(context)
        )
    }
}

@BindingAdapter("place_shortened_with_label")
fun TextView.setShortenedPlaceWithLabel(place: String?) {
    text = context.getString(R.string.place_with_label, place?.shortenPlaceString() ?: "")
}

@BindingAdapter("shortened_place")
fun TextView.setShortenedPlace(place: String?) {
    text = place?.shortenPlaceString() ?: ""
}

@BindingAdapter("place_with_breakline")
fun TextView.setPlaceWithBreakline(place: String?) {
    text = place?.breaklinePlaceString() ?: ""
}
