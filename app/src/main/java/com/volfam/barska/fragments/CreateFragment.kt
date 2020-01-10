package com.volfam.barska.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.volfam.barska.R
import com.volfam.barska.data.VolfamDatabase
import com.volfam.barska.databinding.FragmentCreateBinding
import com.volfam.barska.shareTrainingInvitation
import com.volfam.barska.showErrorSnackbar
import com.volfam.barska.viewmodels.CreateViewModel
import com.volfam.barska.viewmodels.CreateViewModelFactory
import com.volfam.barska.viewmodels.STANDARD_TRAINING_START_TIME_HOUR
import com.volfam.barska.viewmodels.STANDARD_TRAINING_START_TIME_MINUTE
import java.util.*

class CreateFragment : Fragment() {

    private lateinit var createViewModel: CreateViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentCreateBinding>(
            inflater,
            R.layout.fragment_create,
            container,
            false
        )

        val application = requireNotNull(this.activity).application
        val trainingDao = VolfamDatabase.getInstance(application).trainingDao
        val factory = CreateViewModelFactory(trainingDao, application)
        createViewModel = ViewModelProviders.of(this, factory).get(CreateViewModel::class.java)

        binding.createViewModel = createViewModel

        createViewModel.error.observe(this, Observer { messageId ->
            messageId?.let { showErrorSnackbar(binding.root, getString(messageId)) }
        })

        createViewModel.training.observe(this, Observer { training ->
            training?.let {
                shareTrainingInvitation(binding.root, activity!!, it)
                createViewModel.doneNewTraining()
                fragmentManager?.popBackStack()
            }
        })

        val calendar = createViewModel.getCalendar()

        binding.trainingDatePicker.apply {
            init(
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH)
            ) { _, chosenYear, chosenMonth, chosenDate ->
                createViewModel.updateDate(chosenYear, chosenMonth, chosenDate)
            }
        }

        binding.trainingStartTimePicker.apply {
            setIs24HourView(true)
            hour = STANDARD_TRAINING_START_TIME_HOUR
            minute = STANDARD_TRAINING_START_TIME_MINUTE
            createViewModel.updateTime(hour, minute)
            setOnTimeChangedListener { _, chosenHour, chosenMinute ->
                createViewModel.updateTime(chosenHour, chosenMinute)
            }
        }

        binding.submitButton.setOnClickListener {
            createViewModel.updatePrice(binding.priceEdittext.text.toString())
            createViewModel.validateInput()
        }

        return binding.root
    }
}
