package com.volfam.barska.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.volfam.barska.R
import com.volfam.barska.data.Training
import com.volfam.barska.databinding.LayoutHeaderBinding
import com.volfam.barska.databinding.ListItemViewTrainingBinding

private const val ITEM_VIEW_TYPE_ITEM = 0
private const val ITEM_VIEW_TYPE_HEADER_FUTURE = 1
private const val ITEM_VIEW_TYPE_HEADER_PAST = 2

class TrainingAdapter(private val context: Context, private val clickListener: TrainingClickListener) :
    ListAdapter<DataItem, RecyclerView.ViewHolder>(ItemDiffCallback()) {

    fun addHeaderAndSubmitList(trainingList: List<Training>) {
        val itemList = mutableListOf<DataItem>()
        if (trainingList.isNotEmpty()) {
            val current = System.currentTimeMillis()
            if (trainingList.any { it.date >= current }) {
                itemList.add(DataItem.Header(ITEM_VIEW_TYPE_HEADER_FUTURE.toLong(), context))
                itemList.addAll(trainingList.filter { it.date > current }.map {
                    DataItem.TrainingItem(it)
                })
            }
            if (trainingList.any { it.date < current }) {
                itemList.add(DataItem.Header(ITEM_VIEW_TYPE_HEADER_PAST.toLong(), context))
                itemList.addAll(trainingList.filter { it.date < current }.map {
                    DataItem.TrainingItem(it)
                })
            }
        }
        submitList(itemList)
    }

    override fun getItemViewType(position: Int): Int {
        return when (val item = getItem(position)) {
            is DataItem.Header -> if (item.id == ITEM_VIEW_TYPE_HEADER_FUTURE.toLong()) ITEM_VIEW_TYPE_HEADER_FUTURE else ITEM_VIEW_TYPE_HEADER_PAST
            is DataItem.TrainingItem -> ITEM_VIEW_TYPE_ITEM
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            ITEM_VIEW_TYPE_HEADER_FUTURE -> TextViewHolder.from(parent)
            ITEM_VIEW_TYPE_HEADER_PAST -> TextViewHolder.from(parent)
            ITEM_VIEW_TYPE_ITEM -> TrainingViewHolder.from(parent)
            else -> throw ClassCastException("Unknown viewType $viewType")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is TextViewHolder -> holder.bind(getItem(position) as DataItem.Header)
            is TrainingViewHolder -> {
                val trainingItem = getItem(position) as DataItem.TrainingItem
                holder.bind(trainingItem.training, clickListener)
            }
        }
    }

    class TextViewHolder(val binding: LayoutHeaderBinding) : RecyclerView.ViewHolder(binding.root) {

        companion object {
            fun from(parent: ViewGroup): TextViewHolder {
                val inflater = LayoutInflater.from(parent.context)
                val binding = LayoutHeaderBinding.inflate(inflater, parent, false)
                return TextViewHolder(binding)
            }
        }

        fun bind(header: DataItem.Header) {
            binding.header = header
            binding.executePendingBindings()
        }
    }

    class TrainingViewHolder private constructor(val binding: ListItemViewTrainingBinding) :
        RecyclerView.ViewHolder(binding.root) {

        companion object {
            fun from(parent: ViewGroup): TrainingViewHolder {
                val inflater = LayoutInflater.from(parent.context)
                val binding = ListItemViewTrainingBinding.inflate(inflater, parent, false)
                return TrainingViewHolder(binding)
            }
        }

        fun bind(training: Training, clickListener: TrainingClickListener) {
            binding.training = training
            binding.clickListener = clickListener
            binding.executePendingBindings()
        }
    }
}

class ItemDiffCallback : DiffUtil.ItemCallback<DataItem>() {

    override fun areItemsTheSame(oldItem: DataItem, newItem: DataItem): Boolean {
        return oldItem === newItem
    }

    override fun areContentsTheSame(oldItem: DataItem, newItem: DataItem): Boolean {
        return oldItem.id == newItem.id
    }
}

class TrainingClickListener(val clickListener: (trainingId: Long) -> Unit) {
    fun onClick(training: Training) = clickListener(training.trainingId)
}

sealed class DataItem {

    abstract val id: Long

    data class TrainingItem(val training: Training) : DataItem() {
        override val id = training.trainingId
    }

    data class Header(val headerId: Long, val ctx: Context) : DataItem() {
        override val id = headerId
        val label =
            if (id == ITEM_VIEW_TYPE_HEADER_FUTURE.toLong()) ctx.getString(R.string.future_trainings_label)
            else ctx.getString(R.string.past_trainings_label)
    }
}