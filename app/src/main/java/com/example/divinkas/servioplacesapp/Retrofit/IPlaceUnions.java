package com.example.divinkas.servioplacesapp.Retrofit;

import com.example.divinkas.servioplacesapp.Model.SevioAPI_Object;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface IPlaceUnions {
    @GET("GetPlaces")
    Observable<SevioAPI_Object> getPlaceUnionsList();
}
