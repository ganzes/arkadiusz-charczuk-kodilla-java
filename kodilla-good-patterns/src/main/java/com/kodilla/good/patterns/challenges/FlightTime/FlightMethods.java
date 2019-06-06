package com.kodilla.good.patterns.challenges.FlightTime;

import java.util.List;
import java.util.stream.Collectors;

public class FlightMethods {

    public List<String> fromCity(String userChosenAirportsExample1, FlightListOfAirports currentlyAvaliable, FlightProcessingData userChoses) {
        System.out.println("Connection avaiable from: " + userChosenAirportsExample1);

        return userChoses.avaliableFlightsFromCity(currentlyAvaliable.listOfAirports(), userChosenAirportsExample1).stream()
                .map(x -> " From | " + x.getFromCity() + " | to | " + x.getToCity() + " | flight number | " + x.getNumberOfFlight())
                .sorted()
                .collect(Collectors.toList());
    }

    public List<String> toCity(String userChosenAirportsExample2, FlightListOfAirports currentlyAvaliable, FlightProcessingData userChoses) {
        System.out.println("Connection avaiable to: " + userChosenAirportsExample2);

        return userChoses.avaliableFlightsToCity(currentlyAvaliable.listOfAirports(), userChosenAirportsExample2).stream()
                .map(x -> " To | " + x.getToCity() + " | from | " + x.getFromCity() + " | flight number | " + x.getNumberOfFlight())
                .sorted()
                .collect(Collectors.toList());
    }

    public List<String> alternativeFlight(String userChosenAirportsExample3, FlightProcessingData userChoses, FlightAlternativeListOfAirports currentlyAvaliableAlternative) {
        System.out.println("List of alternative connections to: " + userChosenAirportsExample3);

        return userChoses.avaliableFlightsAlternativeConnections(currentlyAvaliableAlternative.flightAlternativesListOfAirports(), "Gdansk").stream()
                .map(x -> " From | " + x.getFromCityAlternative()
                        + " | trough | " + x.getTroughCityAlternative() + " | to | " + x.getToCityAlternative())
                .sorted()
                .collect(Collectors.toList());
    }
}
