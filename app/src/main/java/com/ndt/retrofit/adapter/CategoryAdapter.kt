package com.ndt.retrofit.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ndt.retrofit.databinding.ItemCategoryBinding
import com.ndt.retrofit.model.CateGoryModel
import com.ndt.retrofit.model.CategoryRespone

class CategoryAdapter(private var listCategory: List<CateGoryModel>) :
    RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {
    class ViewHolder(private var binding: ItemCategoryBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(categorp: CateGoryModel) {
            binding.tvIdCategory.text = "ID:" + categorp.idCategory
            binding.tvName.text = "Name:" + categorp.strCategory
            binding.tvDescription.text = "Description:" + categorp.strCategoryThumb
            binding.tvThumb.text = "Thumb:" + categorp.strCategoryDescription
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemCategoryBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listCategory[position])
    }

    override fun getItemCount(): Int = listCategory.size
}