package com.example.brand_000.atownmap;

/**
 * Created by Brand_000 on 25/06/2016.
 * This class holds data relevant to reported locations
 */
public class MapInfo {

    private String name;
    private String description;

    public MapInfo(String name, String description) {
        this.name = name;
        this.description = description;
    }

    //Getters
    public String getName() { return name; }

    public String getDescription() { return description; }

    //setters
    public void setName(String name) { this.name = name; }

    public void setDescription(String description) { this.description = description; }
}
