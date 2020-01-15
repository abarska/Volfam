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
import com.volfam.barska.adapters.TrainingAdapter
import com.volfam.barska.adapters.TrainingClickListener
import com.volfam.barska.data.VolfamDatabase
import com.volfam.barska.databinding.FragmentListFilteredBinding
import com.volfam.barska.showErrorSnackbar
import com.volfam.barska.viewmodels.FilteredListViewModel
import com.volfam.barska.viewmodels.FilteredListViewModelFactory
import timber.log.Timber
import java.text.SimpleDateFormat
import kotlin.math.max

class FilteredListFragment : Fragment() {

    private lateinit var filteredListViewModel: FilteredListViewModel
    private lateinit var binding: FragmentListFilteredBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_list_filtered, container, false)
        binding.lifecycleOwner = this

        val triple = arguments?.let {
            initStringArrayParams(FilteredListFragmentArgs.fromBundle(it))
        }

        val groups = triple?.component1()
        val trainers = triple?.component2()
        val places = triple?.component3()

        val minPrice =
            arguments?.let { FilteredListFragmentArgs.fromBundle(it).minPrice } ?: Int.MIN_VALUE
        val maxPrice =
            arguments?.let { FilteredListFragmentArgs.fromBundle(it).maxPrice } ?: Int.MAX_VALUE
        val startDate =
            arguments?.let { FilteredListFragmentArgs.fromBundle(it).startDate } ?: Long.MIN_VALUE
        val endDate =
            arguments?.let { FilteredListFragmentArgs.fromBundle(it).endDate } ?: Long.MAX_VALUE

        val app = requireNotNull(this.activity).application
        val factory = FilteredListViewModelFactory(
            VolfamDatabase.getInstance(app).trainingDao,
            app,
            groups,
            trainers,
            places,
            minPrice,
            maxPrice,
            startDate,
            endDate
        )
        filteredListViewModel =
            ViewModelProviders.of(this, factory).get(FilteredListViewModel::class.java)

        val adapter = TrainingAdapter(context!!, TrainingClickListener { })
        binding.trainingListRecycler.adapter = adapter

        filteredListViewModel.selectedTrainings.observe(this, Observer { list ->
            list?.let {
                if (it.isEmpty()) {
                    showErrorSnackbar(
                        binding.root,
                        getString(R.string.no_results_matching_filter_error)
                    )
                    fragmentManager?.popBackStack()
                } else adapter.addHeaderAndSubmitList(it)
            }
        })

        return binding.root
    }

    private fun initStringArrayParams(safeArgs: FilteredListFragmentArgs): Triple<List<String>, List<String>, List<String>> {

        val groups = resources.getStringArray(R.array.groups).toList()
        val groupIndices = safeArgs.groupArray?.toList()
        val selectedGroups =
            if (groupIndices.isNullOrEmpty()) groups
            else groupIndices.map { index -> groups[index] }

        val trainers = resources.getStringArray(R.array.trainers).toList()
        val trainerIndices = safeArgs.trainerArray?.toList()
        val selectedTrainers =
            if (trainerIndices.isNullOrEmpty()) trainers
            else trainerIndices.map { index -> trainers[index] }

        val places = resources.getStringArray(R.array.places).toList()
        val placeIndices = safeArgs.placeArray?.toList()
        val selectedPlaces =
            if (placeIndices.isNullOrEmpty()) places
            else placeIndices.map { index -> places[index] }

        return Triple(selectedGroups, selectedTrainers, selectedPlaces)
    }
}