package com.ndt.retrofit.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CategoryRespone(
    @Expose
    @SerializedName("categories")
    val category: List<CateGoryModel>
)
data class CateGoryModel(
    @Expose
    @SerializedName("idCategory")
    val idCategory: String,
    @Expose
    @SerializedName("strCategory")
    val strCategory: String,
    @Expose
    @SerializedName("strCategoryDescription")
    val strCategoryDescription: String,
    @Expose
    @SerializedName("strCategoryThumb")
    val strCategoryThumb: String
)