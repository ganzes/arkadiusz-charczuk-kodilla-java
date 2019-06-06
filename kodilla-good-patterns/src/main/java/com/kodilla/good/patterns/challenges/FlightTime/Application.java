package com.kodilla.good.patterns.challenges.FlightTime;

public class Application {

    public static void main (String [] args){

        String userChosenAirportsExample1;
        String userChosenAirportsExample2;
        String userChosenAirportsExample3;

        FlightListOfAirports currentlyAvaliable = new FlightListOfAirports();
        FlightProcessingData userChoses = new FlightProcessingData();

        FlightAlternativeListOfAirports currentlyAvaliableAlternative = new FlightAlternativeListOfAirports();

        userChosenAirportsExample1 = "Warszawa";
        userChosenAirportsExample2 = "Wroclaw";
        userChosenAirportsExample3 = "Gdansk";

//from city
        System.out.println("Connection avaiable from: " + userChosenAirportsExample1);

        userChoses.avaliableFlightsFromCity(currentlyAvaliable.listOfAirports(), userChosenAirportsExample1).stream()
                .map(x -> " From | " + x.getFromCity() + " | to | " + x.getToCity() + " | flight number | " + x.getNumberOfFlight())
                .sorted()
                .forEach(System.out::println);

//to city
        System.out.println("Connection avaiable to: " + userChosenAirportsExample2);
        userChoses.avaliableFlightsToCity(currentlyAvaliable.listOfAirports(), userChosenAirportsExample2).stream()
                .map(x -> " To | " +x.getToCity() + " | from | " + x.getFromCity() + " | flight number | " + x.getNumberOfFlight())
                .sorted()
                .forEach(System.out::println);

//avaiable alternative connections like for VIP users:
        System.out.println("List of alternative connections to: " + userChosenAirportsExample3);
        userChoses.avaliableFlightsAlternativeConnections(currentlyAvaliableAlternative.flightAlternativesListOfAirports(), "Gdansk").stream()
                .map(x -> " From | " + x.getFromCityAlternative()
                        + " | trough | " + x.getTroughCityAlternative() + " | to | "+ x.getToCityAlternative())
                .sorted()
                .forEach(System.out::println);
    }
}
