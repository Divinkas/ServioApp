package com.example.divinkas.servioplacesapp.Model;

import java.util.List;

public class SevioAPI_Object {
    public List<PlaceUnions> PlaceUnions;

    public SevioAPI_Object(){}
    public SevioAPI_Object(List<com.example.divinkas.servioplacesapp.Model.PlaceUnions> placeUnions) {
        PlaceUnions = placeUnions;
    }

    public List<com.example.divinkas.servioplacesapp.Model.PlaceUnions> getPlaceUnions() {
        return PlaceUnions;
    }

    public void setPlaceUnions(List<com.example.divinkas.servioplacesapp.Model.PlaceUnions> placeUnions) {
        PlaceUnions = placeUnions;
    }
}
