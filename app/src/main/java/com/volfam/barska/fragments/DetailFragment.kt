package com.volfam.barska.fragments

import android.app.AlertDialog
import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.google.android.material.snackbar.Snackbar
import com.volfam.barska.*
import com.volfam.barska.data.Training
import com.volfam.barska.data.VolfamDatabase
import com.volfam.barska.databinding.FragmentDetailBinding
import com.volfam.barska.viewmodels.DetailViewModel
import com.volfam.barska.viewmodels.DetailViewModelFactory

private lateinit var binding: FragmentDetailBinding
private lateinit var detailViewModel: DetailViewModel

const val DISABLED_BUTTON = 100

class DetailFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        setHasOptionsMenu(true)

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_detail, container, false)
        binding.lifecycleOwner = this

        val app = requireNotNull(this.activity).application
        val trainingDao = VolfamDatabase.getInstance(app).trainingDao
        val factory = DetailViewModelFactory(
            trainingDao, app, DetailFragmentArgs.fromBundle(arguments!!).trainingId
        )
        detailViewModel = ViewModelProviders.of(this, factory).get(DetailViewModel::class.java)
        binding.detailViewModel = detailViewModel

        detailViewModel.training.observe(this, Observer { training ->
            training?.let {
                detailViewModel.initObservableValues()
                initOnClickListeners()
                initPriceObserver()
            }
        })

        binding.changeButton.setOnClickListener { view ->
            val updated = detailViewModel.updateTraining()
            if (binding.shareAgainCheckboxLabel.isChecked) {
                shareTrainingInvitation(view, activity!!, updated)
            }
            fragmentManager?.popBackStack()
        }

        return binding.root
    }

    private fun initOnClickListeners() {

        if (!binding.timeTextview.hasOnClickListeners()) {
            binding.timeTextview.setOnClickListener {
                showTimePickerDialog(detailViewModel.trainingDateTime.value!!)
            }
        }
        if (!binding.dateTextview.hasOnClickListeners()) {
            binding.dateTextview.setOnClickListener {
                showDatePickerDialog(detailViewModel.trainingDateTime.value!!)
            }
        }

        if (!binding.timeTextview.hasOnClickListeners()) {
            binding.timeTextview.setOnClickListener {
                showTimePickerDialog(detailViewModel.trainingDateTime.value!!)
            }
        }

        if (!binding.dateTextview.hasOnClickListeners()) {
            binding.dateTextview.setOnClickListener {
                showDatePickerDialog(detailViewModel.trainingDateTime.value!!)
            }
        }

        if (!binding.groupTextview.hasOnClickListeners()) {
            binding.groupTextview.setOnClickListener {
                showGroupPickerDialog(detailViewModel.training.value!!)
            }
        }

        if (!binding.trainerTextview.hasOnClickListeners()) {
            binding.trainerTextview.setOnClickListener {
                showTrainerPickerDialog(detailViewModel.training.value!!)
            }
        }

        if (!binding.placeTextview.hasOnClickListeners()) {
            binding.placeTextview.setOnClickListener {
                showPlacePickerDialog(detailViewModel.training.value!!)
            }
        }

        if (!binding.plusFiveButton.hasOnClickListeners()) {
            binding.plusFiveButton.setOnClickListener {
                detailViewModel.addFiveToPrice()
            }
        }

        if (!binding.minusFiveButton.hasOnClickListeners()) {
            binding.minusFiveButton.setOnClickListener {
                detailViewModel.substractFiveFromPrice()
            }
        }
    }

    private fun initPriceObserver() {

        detailViewModel.trainingPrice.observe(this, Observer { newPrice ->
            newPrice?.let { it ->
                binding.priceTextview.text = getString(R.string.price_formatter, it)

                if (it == 0) {
                    binding.priceTextview.text = getString(R.string.free_of_charge_label)
                    binding.minusFiveButton.apply {
                        binding.minusFiveButton.imageAlpha = DISABLED_BUTTON
                        binding.minusFiveButton.isClickable = false
                    }
                }

                if (it == 5) {
                    binding.minusFiveButton.imageAlpha = binding.plusFiveButton.imageAlpha
                    binding.minusFiveButton.isClickable = true
                }

                if (it >= 150) {
                    Snackbar.make(
                        binding.plusFiveButton,
                        getString(R.string.high_price_warning),
                        Snackbar.LENGTH_SHORT
                    ).show()
                }
            }
        })
    }

    private fun showTimePickerDialog(millis: Long) {
        TimePickerFragment(millis, detailViewModel).show(fragmentManager!!, "timePicker")
    }

    private fun showDatePickerDialog(millis: Long) {
        DatePickerFragment(millis, detailViewModel).show(fragmentManager!!, "datePicker")
    }

    private fun showGroupPickerDialog(training: Training) {
        val groups = resources.getStringArray(R.array.groups)
        val index = groups.indexOf(training.group)
        val builder = AlertDialog.Builder(context)
        val dialog = builder.apply {
            setSingleChoiceItems(groups, index) { dialogInterface, position ->
                detailViewModel.updateTrainingGroup(groups[position])
                dialogInterface.dismiss()
            }
            setNeutralButton(getString(R.string.cancel)) { dialog, _ ->
                dialog.cancel()
            }
        }.create()
        dialog.show()
    }

    private fun showTrainerPickerDialog(training: Training) {

        val trainers = resources.getStringArray(R.array.trainers)
        val trainersShortened = trainers.map { it.shortenTrainerName(context!!) }
        val index = trainers.indexOf(training.trainer)

        val builder = AlertDialog.Builder(context)
        val dialog = builder.apply {
            setSingleChoiceItems(
                trainersShortened.toTypedArray(),
                index
            ) { dialogInterface, position ->
                detailViewModel.updateTrainingTrainer(trainers[position])
                dialogInterface.dismiss()
            }
            setNeutralButton(getString(R.string.cancel)) { dialog, _ ->
                dialog.cancel()
            }
        }.create()
        dialog.show()
    }

    private fun showPlacePickerDialog(training: Training) {

        val places = resources.getStringArray(R.array.places)
        val shortenedPlaces =
            places.map { address -> address.firstLinePlaceString() }.toTypedArray()
        val index = places.indexOf(training.place)
        val builder = AlertDialog.Builder(context)
        val dialog = builder.apply {
            setSingleChoiceItems(shortenedPlaces, index) { dialogInterface, position ->
                detailViewModel.updateTrainingPlace(places[position])
                dialogInterface.dismiss()
            }
            setNeutralButton(getString(R.string.cancel)) { dialog, _ ->
                dialog.cancel()
            }
        }.create()
        dialog.show()
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_detail_fragment, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.action_clear) {
            detailViewModel.deleteTraining()
            Snackbar.make(
                binding.root,
                getString(R.string.data_deleted_label),
                Snackbar.LENGTH_SHORT
            ).show()
            fragmentManager?.popBackStack()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}