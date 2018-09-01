package com.example.divinkas.servioplacesapp.Model;

import java.util.ArrayList;

public class PlaceUnions {
    public String Name;
    public ArrayList<PlaceGroups> PlaceGroups;

    public PlaceUnions(){}
    public PlaceUnions(String name, ArrayList<PlaceGroups> PlaceGroups) {
        Name = name;
        this.PlaceGroups = PlaceGroups;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public ArrayList<PlaceGroups> getPlaceGroups() {
        return PlaceGroups;
    }

    public void setPlaceGroups(ArrayList<PlaceGroups> placeGroups) {
        this.PlaceGroups = placeGroups;
    }
}
