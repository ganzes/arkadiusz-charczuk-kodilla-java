package com.kodilla.good.patterns.challenges.FlightTime;

public class Application {

    public static void main (String [] args){

        String userChosenAirportsExample1;
        String userChosenAirportsExample2;
        String userChosenAirportsExample3;

        FlightListOfAirports currentlyAvaliable = new FlightListOfAirports();
        FlightProcessingData userChoses = new FlightProcessingData();

        userChosenAirportsExample1 = "Warszawa";
        userChosenAirportsExample2 = "Wroclaw";
        userChosenAirportsExample3 = "Gdansk";
//from city
        System.out.println("Connection avaiable from: " + userChosenAirportsExample1);

        userChoses.avaliableFlightsFromCity(currentlyAvaliable.listOfAirports(), userChosenAirportsExample1).stream()
                .map(x -> x.getFromCity() + " | to | " + x.getToCity() + " | flight number | " + x.getNumberOfFlight())
                .sorted()
                .forEach(System.out::println);

//to city
        System.out.println("Connection avaiable to: " + userChosenAirportsExample2);
        userChoses.avaliableFlightsToCity(currentlyAvaliable.listOfAirports(), userChosenAirportsExample2).stream()
                .map(x -> x.getToCity() + " | from | " + x.getFromCity() + " | flight number | " + x.getNumberOfFlight())
                .sorted()
                .forEach(System.out::println);

//avaiable alternative connections like for VIP users:
        System.out.println("List of alternative connections " + userChosenAirportsExample3);
        System.out.println("Connection avaiable to: " + userChosenAirportsExample3);
        userChoses.avaliableFlightsAlternativeConnections(currentlyAvaliable.listOfAirports(), true).stream()
                .map(x -> x.getToCity() + " | from | " + x.getFromCity() + " | flight number | " + x.getNumberOfFlight())
                .sorted()
                .forEach(System.out::println);
    }
}
