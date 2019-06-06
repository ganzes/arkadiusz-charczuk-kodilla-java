package com.kodilla.good.patterns.challenges.FlightTime;

public class Application {

    public static void main(String[] args) {

        String userChosenAirportsExample1;
        String userChosenAirportsExample2;
        String userChosenAirportsExample3;

        FlightListOfAirports currentlyAvaliable = new FlightListOfAirports();

        FlightProcessingData userChoses = new FlightProcessingData();

        FlightMethods flightMethods = new FlightMethods();

        FlightAlternativeListOfAirports currentlyAvaliableAlternative = new FlightAlternativeListOfAirports();

        userChosenAirportsExample1 = "Warszawa";
        userChosenAirportsExample2 = "Wroclaw";
        userChosenAirportsExample3 = "Gdansk";

//from city
        System.out.println(flightMethods.fromCity(userChosenAirportsExample1, currentlyAvaliable, userChoses));
//to city
        System.out.println(flightMethods.toCity(userChosenAirportsExample2, currentlyAvaliable, userChoses));
//avaiable alternative connections like for VIP users:
        System.out.println(flightMethods.alternativeFlight(userChosenAirportsExample3, userChoses, currentlyAvaliableAlternative));
    }
}
