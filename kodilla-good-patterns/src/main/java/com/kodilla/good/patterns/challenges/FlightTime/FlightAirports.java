package com.kodilla.good.patterns.challenges.FlightTime;

public class FlightAirports {

    private String numberOfFlight;
    private String fromCity;
    private String toCity;
    private boolean isAvaiable;


    public FlightAirports(String numberOfFlight, String fromCity, String toCity, boolean isAvaiable) {
        this.numberOfFlight = numberOfFlight;
        this.fromCity = fromCity;
        this.toCity = toCity;
        this.isAvaiable = isAvaiable;
    }

    public String getNumberOfFlight() {
        return numberOfFlight;
    }

    public String getFromCity() {
        return fromCity;
    }

    public String getToCity() {
        return toCity;
    }

    public boolean isAvaiable() {
        return isAvaiable;
    }
}
