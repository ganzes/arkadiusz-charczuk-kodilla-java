package com.kodilla.good.patterns.challenges.FlightTime;

public class FlightAlternative {
    private String fromCityAlternative;
    private String toCityAlternative;
    private String troughCityAlternative;
    boolean isAvaiable;

    public FlightAlternative(String fromCityAlternative, String toCityAlternative, String troughCityAlternative, boolean isAvaiable) {
        this.fromCityAlternative = fromCityAlternative;
        this.toCityAlternative = toCityAlternative;
        this.troughCityAlternative = troughCityAlternative;
        this.isAvaiable = isAvaiable;
    }

    public String getFromCityAlternative() {
        return fromCityAlternative;
    }

    public String getToCityAlternative() {
        return toCityAlternative;
    }

    public String getTroughCityAlternative() {
        return troughCityAlternative;
    }

    public boolean isAvaiable() {
        return isAvaiable;
    }
}
