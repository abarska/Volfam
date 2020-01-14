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
        val factory = ListViewModelFactory(VolfamDatabase.getInstance(app).trainingDao, app)
        listViewModel = ViewModelProviders.of(this, factory).get(ListViewModel::class.java)

        val adapter = TrainingAdapter(context!!, TrainingClickListener { trainingId ->
            listViewModel.onTrainingClicked(trainingId)
        })
        binding.trainingListRecycler.adapter = adapter

        listViewModel.trainings.observe(this, Observer { list ->
            activity?.invalidateOptionsMenu()
            list?.let {
                binding.welcomeTextView.visibility = if (list.isEmpty()) View.VISIBLE else View.GONE
                adapter.addHeaderAndSubmitList(it)
            }
        })

        listViewModel.navigateToDetailFragment.observe(this,
            Observer { trainingId ->
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

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_list_fragment, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onPrepareOptionsMenu(menu: Menu) {
        super.onPrepareOptionsMenu(menu)
        menu.findItem(R.id.action_clear).isVisible =
            !listViewModel.trainings.value.isNullOrEmpty()
        menu.findItem(R.id.action_filter).isVisible =
            !listViewModel.trainings.value.isNullOrEmpty()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_clear -> {
                showClearConfirmationDialog()
                return true
            }
            R.id.action_filter -> {
                listViewModel.onFilterMenuItemClicked()
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
