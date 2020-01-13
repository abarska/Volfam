package com.volfam.barska.fragments

import android.os.Bundle
import android.view.*
import androidx.appcompat.app.AlertDialog
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.volfam.barska.R
import com.volfam.barska.adapters.TrainingAdapter
import com.volfam.barska.adapters.TrainingClickListener
import com.volfam.barska.data.VolfamDatabase
import com.volfam.barska.databinding.FragmentListBinding
import com.volfam.barska.viewmodels.ListViewModel
import com.volfam.barska.viewmodels.ListViewModelFactory

class ListFragment : Fragment() {

    private lateinit var listViewModel: ListViewModel
    private lateinit var binding: FragmentListBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        setHasOptionsMenu(true)

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_list, container, false)
        binding.lifecycleOwner = this

        val app = requireNotNull(this.activity).application

        val triple = arguments?.let {
            initQueryParams(ListFragmentArgs.fromBundle(it))
        }
        val groups = triple?.component1()
        val trainers = triple?.component2()
        val places = triple?.component3()

        val factory = ListViewModelFactory(
            VolfamDatabase.getInstance(app).trainingDao,
            app,
            groups,
            trainers,
            places
        )
        listViewModel = ViewModelProviders.of(this, factory).get(ListViewModel::class.java)
        binding.viewModel = listViewModel

        val adapter = TrainingAdapter(context!!, TrainingClickListener { trainingId ->
            listViewModel.onTrainingClicked(trainingId)
        })
        binding.trainingListRecycler.adapter = adapter

        listViewModel.trainings.observe(this, Observer { list ->

            // hide clear menu icon if the list is null or empty
            // change filter icon depending on isFiltered boolean
            activity?.invalidateOptionsMenu()

            // new comment
            list?.let { adapter.addHeaderAndSubmitList(it) }
        })

        listViewModel.rowsInTable.observe(this, Observer { rows ->
            rows.let {
                listViewModel.updateIsFiltered(rows != (binding.trainingListRecycler.adapter as TrainingAdapter).itemCount)
            }
        })

        listViewModel.navigateToDetailFragment.observe(this, Observer { trainingId ->
            trainingId?.let {
                findNavController().navigate(
                    ListFragmentDirections.actionListFragmentToDetailFragment(it)
                )
                listViewModel.onTrainingDetailNavigated()
            }
        })

        listViewModel.navigateToFilterFragment.observe(this, Observer { maxPrice ->
            maxPrice?.let {
                findNavController().navigate(
                    ListFragmentDirections.actionListFragmentToFilterFragment(maxPrice)
                )
                listViewModel.onFilterFragmentNavigated()
            }
        })

        binding.addTrainingFab.setOnClickListener {
            findNavController()
                .navigate(ListFragmentDirections.actionListFragmentToCreateFragment())
        }

        return binding.root
    }

    private fun initQueryParams(safeArgs: ListFragmentArgs): Triple<List<String>, List<String>, List<String>> {

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

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_list_fragment, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onPrepareOptionsMenu(menu: Menu) {
        super.onPrepareOptionsMenu(menu)

        menu.findItem(R.id.action_clear).isVisible = !listViewModel.trainings.value.isNullOrEmpty()
        menu.findItem(R.id.action_filter).isVisible = !listViewModel.trainings.value.isNullOrEmpty()

        menu.findItem(R.id.action_filter).icon = if (listViewModel.isFiltered) {
            resources.getDrawable(R.drawable.ic_antifilter_list_white_24dp, resources.newTheme())
        } else {
            resources.getDrawable(R.drawable.ic_filter_list_white_24dp, resources.newTheme())
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_clear -> {
                showClearConfirmationDialog()
                return true
            }
            R.id.action_filter -> {
                if (listViewModel.isFiltered) listViewModel.clearFilters()
                else listViewModel.onFilterMenuItemClicked()
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun showClearConfirmationDialog() {
        val ctx = context!!
        AlertDialog.Builder(ctx)
            .setTitle(ctx.getString(R.string.confirmation_dialog_header))
            .setMessage(ctx.getString(R.string.confirmation_dialog_body))
            .setPositiveButton(ctx.getString(R.string.yes_button)) { _, _ ->
                listViewModel.clearData()
                Snackbar.make(
                    binding.trainingListRecycler,
                    ctx.getString(R.string.data_deleted_label),
                    Snackbar.LENGTH_SHORT
                ).show()
            }
            .setNegativeButton(ctx.getString(R.string.no_button)) { _, _ ->
                return@setNegativeButton
            }.create()
            .show()
    }
}
