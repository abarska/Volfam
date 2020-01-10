package com.volfam.barska

import android.app.DatePickerDialog
import android.app.Dialog
import android.app.TimePickerDialog
import android.os.Bundle
import android.text.format.DateFormat
import android.widget.DatePicker
import android.widget.TimePicker
import androidx.fragment.app.DialogFragment
import com.volfam.barska.data.Training
import com.volfam.barska.viewmodels.DetailViewModel
import java.util.*
import kotlin.time.milliseconds

class TimePickerFragment(
    private val currentTime: Long,
    private val detailViewModel: DetailViewModel
) : DialogFragment(),
    TimePickerDialog.OnTimeSetListener {

    private val calendar: Calendar = Calendar.getInstance()

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        calendar.timeInMillis = currentTime
        val hour = calendar.get(Calendar.HOUR_OF_DAY)
        val minute = calendar.get(Calendar.MINUTE)
        return TimePickerDialog(activity, this, hour, minute, DateFormat.is24HourFormat(activity))
    }

    override fun onTimeSet(view: TimePicker, hourOfDay: Int, minute: Int) {
        calendar.apply {
            set(Calendar.HOUR_OF_DAY, hourOfDay)
            set(Calendar.MINUTE, minute)
        }
        detailViewModel.updateTrainingTime(calendar.timeInMillis)
    }
}

class DatePickerFragment(
    private val currentTime: Long,
    private val detailViewModel: DetailViewModel
) : DialogFragment(), DatePickerDialog.OnDateSetListener {

    private val calendar: Calendar = Calendar.getInstance()

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        calendar.timeInMillis = currentTime
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)
        return DatePickerDialog(activity!!, this, year, month, day)
    }

    override fun onDateSet(view: DatePicker, year: Int, month: Int, day: Int) {
        calendar.apply {
            set(Calendar.YEAR, year)
            set(Calendar.MONTH, month)
            set(Calendar.DATE, day)
        }
        detailViewModel.updateTrainingTime(calendar.timeInMillis)
    }
}