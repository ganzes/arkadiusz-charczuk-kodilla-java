package com.kodilla.good.patterns.challenges.FlightTime;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightProcessingData {

        public List<FlightAirports> avaliableFlightsFromCity (ArrayList<FlightAirports> flightListOfAirports, String userChosenAirportsExample1) {

            return flightListOfAirports.stream()
                    .filter(x -> x.getFromCity().equals(userChosenAirportsExample1))
                    .collect(Collectors.toList());
    }

    public List<FlightAirports> avaliableFlightsToCity (ArrayList<FlightAirports> flightListOfAirports, String userChosenAirportsExample2) {

        return flightListOfAirports.stream()
                .filter(x -> x.getToCity().equals(userChosenAirportsExample2))
                .collect(Collectors.toList());
    }

    public List<FlightAirports> avaliableFlightsAlternativeConnections (ArrayList<FlightAirports> flightListOfAirports, Boolean userChosenAirportsExample3) {

        return flightListOfAirports.stream()
                .filter(x -> x.isConnection())
                .collect(Collectors.toList());
    }

}
