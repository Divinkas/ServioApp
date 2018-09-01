package com.example.divinkas.servioplacesapp.Model;

import java.util.ArrayList;
import java.util.List;

public class PlaceGroups {
    public String Name;
    public ArrayList<PlaceGroupSchemas> PlaceGroupSchemas;

    public PlaceGroups(){}
    public PlaceGroups(String name, ArrayList<PlaceGroupSchemas> PlaceGroupSchemas) {
        Name = name;
        this.PlaceGroupSchemas = PlaceGroupSchemas;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<PlaceGroupSchemas> getPlaceGroupSchemas() {
        return PlaceGroupSchemas;
    }

    public void setPlaceGroupSchemas(ArrayList<PlaceGroupSchemas> placeGroupSchemas) {
        this.PlaceGroupSchemas = placeGroupSchemas;
    }
}
