package com.volfam.barska.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import com.savvi.rangedatepicker.CalendarPickerView
import com.volfam.barska.R
import com.volfam.barska.databinding.FragmentFilterBinding
import com.volfam.barska.viewmodels.ACTION_ADD
import com.volfam.barska.viewmodels.ACTION_REMOVE
import com.volfam.barska.viewmodels.FilterViewModel
import com.volfam.barska.viewmodels.FilterViewModelFactory
import timber.log.Timber
import java.text.SimpleDateFormat
import java.util.*

const val PRICE_RANGE_BAR_TICK_VALUE = 5

class FilterFragment : Fragment() {

    private lateinit var binding: FragmentFilterBinding
    private lateinit var filterViewModel: FilterViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_filter, container, false)
        binding.lifecycleOwner = this

        val factory = FilterViewModelFactory(activity!!.application)
        filterViewModel = ViewModelProviders.of(this, factory).get(FilterViewModel::class.java)
        binding.filterViewModel = filterViewModel

        initCheckboxListeners()

        arguments?.let {
            val args = FilterFragmentArgs.fromBundle(it)
            initPriceRangebar(args.maxPrice)
            initDatePickerDialog(args.minDate, args.maxDate)
        }

        filterViewModel.priceRangeText.observe(this, Observer { price ->
            price?.let { binding.priceRangeTextview.text = it }
        })

        binding.submitButton.setOnClickListener {

            val prices = filterViewModel.getPrices()
            val dates = filterViewModel.getDates()

            it.findNavController().navigate(
                FilterFragmentDirections.actionFilterFragmentToFilteredListFragment(
                    prices.component1(),
                    prices.component2(),
                    dates.component1(),
                    dates.component2()
                )
                    .setGroupArray(filterViewModel.arrayOfGroups)
                    .setTrainerArray(filterViewModel.arrayOfTrainers)
                    .setPlaceArray(filterViewModel.arrayOfPlaces)
            )
        }
        return binding.root
    }

    private fun initCheckboxListeners() {
        val onCheckedListener = { view: View ->
            val value = (view as CheckBox).text.toString()
            when (val tag = view.tag.toString()) {
                getString(R.string.trainer_label) -> {
                    if (view.isChecked) filterViewModel.modifySet(tag, value, ACTION_ADD)
                    else filterViewModel.modifySet(tag, value, ACTION_REMOVE)
                }
                getString(R.string.group_label) -> {
                    if (view.isChecked) filterViewModel.modifySet(tag, value, ACTION_ADD)
                    else filterViewModel.modifySet(tag, value, ACTION_REMOVE)
                }
                getString(R.string.place_label) -> {
                    if (view.isChecked) filterViewModel.modifySet(tag, value, ACTION_ADD)
                    else filterViewModel.modifySet(tag, value, ACTION_REMOVE)
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

    private fun initPriceRangebar(maxPrice: Int) {
        binding.priceRangeBar.left = 0
        binding.priceRangeBar.right = maxPrice
        filterViewModel.updatePrice(binding.priceRangeBar.left, binding.priceRangeBar.right)

        binding.priceRangeBar.setTickCount(maxPrice / PRICE_RANGE_BAR_TICK_VALUE)
        binding.priceRangeBar.setOnRangeBarChangeListener { _, left, right ->
            filterViewModel.updatePrice(
                left * PRICE_RANGE_BAR_TICK_VALUE,
                right * PRICE_RANGE_BAR_TICK_VALUE + PRICE_RANGE_BAR_TICK_VALUE
            )
        }
    }

    private fun initDatePickerDialog(minDate: Long, maxDate: Long) {

        binding.dateRangePicker.init(Date(minDate), Date(maxDate))
            .inMode(CalendarPickerView.SelectionMode.RANGE)

        binding.dateRangePicker.setOnDateSelectedListener(object :
            CalendarPickerView.OnDateSelectedListener {

            override fun onDateSelected(date: Date?) {
                date?.let { filterViewModel.addDate(it.time) }
            }

            override fun onDateUnselected(date: Date?) {
                date?.let { filterViewModel.removeDate(it.time) }
            }
        })
    }

}