package com.betiana.androidmaster.Superheroapp

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("/api/3568536466715697/search/{name}")
    suspend fun getSuperheroes(@Path("name") superheroName:String):Response<SuperHeroDataResponse>

    @GET("/api/3568536466715697/{id}")
    suspend fun getSuperheroDetail(@Path("id") superheroId:String):Response<SuperHeroDetailResponse>
}