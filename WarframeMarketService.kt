package com.example.arcanevaluecompanion

import retrofit2.Call
import retrofit2.http.GET

interface WarframeMarketService {
    @GET("/items")
    fun getAllItems(): Call<ItemResponse>
}