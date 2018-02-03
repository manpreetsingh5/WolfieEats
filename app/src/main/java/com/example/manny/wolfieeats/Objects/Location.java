package com.example.manny.wolfieeats.Objects;

import java.util.ArrayList;

/**
 * Created by Manny on 2/3/18.
 */

public class Location {
    private String name;
    private ArrayList areas;

    public Location(String name) {
        this.name = name;
        this.areas = new ArrayList<Area>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList getAreas() {
        return areas;
    }

    public void setAreas(ArrayList areas) {
        this.areas = areas;
    }

    public void addArea(Area area) {
        areas.add(area);
    }
}
