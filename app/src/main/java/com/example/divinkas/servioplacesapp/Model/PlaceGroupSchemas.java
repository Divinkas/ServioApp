package com.example.divinkas.servioplacesapp.Model;

import java.util.ArrayList;

public class PlaceGroupSchemas {
    public String Name;
    public ArrayList<Places> Places;

    public PlaceGroupSchemas(){}
    public PlaceGroupSchemas(String name, ArrayList<Places> Places) {
        Name = name;
        this.Places = Places;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public ArrayList<Places> getPlaces() {
        return Places;
    }

    public void setPlaces(ArrayList<Places> places) {
        this.Places = places;
    }
}
