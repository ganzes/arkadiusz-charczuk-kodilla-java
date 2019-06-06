package com.kodilla.good.patterns.challenges.FlightTime;

public class Application {

    public static void main(String[] args) {

        FlightListOfAirports currentlyAvaliable = new FlightListOfAirports();

        FlightProcessingData userChoses = new FlightProcessingData();

        FlightMethods flightMethods = new FlightMethods();

        FlightAlternativeListOfAirports currentlyAvaliableAlternative = new FlightAlternativeListOfAirports();

//from city
        System.out.println(flightMethods.fromCity("Warszawa", currentlyAvaliable, userChoses));
//to city
        System.out.println(flightMethods.toCity("Wroclaw", currentlyAvaliable, userChoses));
//avaiable alternative connections like for VIP users:
        System.out.println(flightMethods.alternativeFlight("Gdansk", userChoses, currentlyAvaliableAlternative));
    }
}
