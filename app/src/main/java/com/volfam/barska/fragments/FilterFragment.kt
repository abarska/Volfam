package com.volfam.barska.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import com.volfam.barska.R
import com.volfam.barska.databinding.FragmentFilterBinding
import com.volfam.barska.viewmodels.ACTION_ADD
import com.volfam.barska.viewmodels.ACTION_REMOVE
import com.volfam.barska.viewmodels.FilterViewModel
import com.volfam.barska.viewmodels.FilterViewModelFactory
import timber.log.Timber

class FilterFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentFilterBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_filter, container, false)
        binding.lifecycleOwner = this

        arguments?.let {
            val max = FilterFragmentArgs.fromBundle(it)
            Timber.i("$max")
        }
        Timber.i("control log")

        val factory = FilterViewModelFactory(activity!!.application)
        val filterViewModel = ViewModelProviders.of(this, factory).get(FilterViewModel::class.java)
        binding.viewModel = filterViewModel

        initCheckboxListeners(binding, filterViewModel)

        binding.submitButton.setOnClickListener {
            it.findNavController().navigate(
                FilterFragmentDirections.actionFilterFragmentToListFragment()
                    .setGroupArray(filterViewModel.arrayOfGroups)
                    .setTrainerArray(filterViewModel.arrayOfTrainers)
                    .setPlaceArray(filterViewModel.arrayOfPlaces)
            )
            fragmentManager?.popBackStack()
        }
        return binding.root
    }

    private fun initCheckboxListeners(binding: FragmentFilterBinding, viewModel: FilterViewModel) {
        val onCheckedListener = { view: View ->
            val value = (view as CheckBox).text.toString()
            when (val tag = view.tag.toString()) {
                getString(R.string.trainer_label) -> {
                    if (view.isChecked) viewModel.modifySet(tag, value, ACTION_ADD)
                    else viewModel.modifySet(tag, value, ACTION_REMOVE)
                }
                getString(R.string.group_label) -> {
                    if (view.isChecked) viewModel.modifySet(tag, value, ACTION_ADD)
                    else viewModel.modifySet(tag, value, ACTION_REMOVE)
                }
                getString(R.string.place_label) -> {
                    if (view.isChecked) viewModel.modifySet(tag, value, ACTION_ADD)
                    else viewModel.modifySet(tag, value, ACTION_REMOVE)
                }
            }
        }
        binding.smugiljovCheckbox.setOnClickListener(onCheckedListener)
        binding.sokolovskayaCheckbox.setOnClickListener(onCheckedListener)
        binding.noTrainerCheckbox.setOnClickListener(onCheckedListener)
        binding.lightCheckbok.setOnClickListener(onCheckedListener)
        binding.mediumCheckbox.setOnClickListener(onCheckedListener)
        binding.girlsCheckbox.setOnClickListener(onCheckedListener)
        binding.familyCheckbox.setOnClickListener(onCheckedListener)
        binding.kuznechnayaCheckbox.setOnClickListener(onCheckedListener)
        binding.didrikhsonaCheckbox.setOnClickListener(onCheckedListener)
        binding.peresypCheckbox.setOnClickListener(onCheckedListener)
    }
}