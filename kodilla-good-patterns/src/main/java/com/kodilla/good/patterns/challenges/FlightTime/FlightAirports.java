package com.kodilla.good.patterns.challenges.FlightTime;

public class FlightAirports {

    private String numberOfFlight;
    private String fromCity;
    private String toCity;
    private boolean connection;

    public FlightAirports(String numberOfFlight, String fromCity, String toCity, boolean connection) {
        this.numberOfFlight = numberOfFlight;
        this.fromCity = fromCity;
        this.toCity = toCity;
        this.connection = connection;
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

    public boolean isConnection() {
        return connection;
    }
}
