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


    public List<FlightAlternative> avaliableFlightsAlternativeConnections (ArrayList<FlightAlternative> flightListOfAirports, String userChosenAirportsExample3) {

        return flightListOfAirports.stream()
                .filter(x -> x.getToCityAlternative().equals(userChosenAirportsExample3))
                .collect(Collectors.toList());
    }



}
