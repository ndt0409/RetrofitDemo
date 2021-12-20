package com.ndt.retrofit.network

import com.ndt.retrofit.model.CategoryRespone
import retrofit2.Call
import retrofit2.http.GET

interface CategoryService {
    @GET("categories.php/")
    fun getAllCategory(): Call<CategoryRespone>
}