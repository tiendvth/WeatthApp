package com.example.weather_app;


import android.net.Uri;

public class Weather {
    private String base;
    private String visibility;
    private String dt;
    private String timezone;
    private String id;
    private String name;
    private String cod;

    private Coord coord;
    private MainInfo main;

    public Weather(String base, String visibility, String dt, String timezone, String id, String name, String cod, Coord coord, MainInfo main) {
        this.base = base;
        this.visibility = visibility;
        this.dt = dt;
        this.timezone = timezone;
        this.id = id;
        this.name = name;
        this.cod = cod;
        this.coord = coord;
        this.main = main;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public MainInfo getMain() {
        return main;
    }

    public void setMain(MainInfo main) {
        this.main = main;
    }
}
