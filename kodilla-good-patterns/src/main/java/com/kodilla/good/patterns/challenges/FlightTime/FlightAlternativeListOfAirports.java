package com.kodilla.good.patterns.challenges.FlightTime;

import java.util.ArrayList;

public class FlightAlternativeListOfAirports {

    public ArrayList<FlightAlternative> flightAlternativesListOfAirports() {

        ArrayList<FlightAlternative> flightAlternativesListOfAirports = new ArrayList<>();
        flightAlternativesListOfAirports.add(new FlightAlternative("Warszawa", "Gdansk", "Wroclaw", true));
        flightAlternativesListOfAirports.add(new FlightAlternative("Warszawa", "Wroclaw", "Gdansk", true));
        flightAlternativesListOfAirports.add(new FlightAlternative("Wroclaw", "Warszawa", "Gdansk", true));
        flightAlternativesListOfAirports.add(new FlightAlternative("Gdansk", "Warszawa", "Wroclaw", true));

        return flightAlternativesListOfAirports;
    }

}
