package fr.fms.entities;

import pooEx1Object.City;

public class Capital extends City {

    private String monument;

    // Constructeurs
    public Capital(String cityName, String country, int numberOfResidents, String monument) {
        super(cityName, country, numberOfResidents); 
        setMonument(monument);
    }

    public String getMonument() {
        return monument;
    }

    public void setMonument(String monument) {
        this.monument = monument;
    }

    @Override
    public String toString() {
        return super.toString() + " monument : " + monument;
    }
}
