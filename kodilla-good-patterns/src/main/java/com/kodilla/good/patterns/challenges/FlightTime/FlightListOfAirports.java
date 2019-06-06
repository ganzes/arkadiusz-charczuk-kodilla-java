package com.kodilla.good.patterns.challenges.FlightTime;

import java.util.ArrayList;

public class FlightListOfAirports {

    public ArrayList<FlightAirports> listOfAirports (){

        ArrayList<FlightAirports> listOfAirports = new ArrayList<>();

        listOfAirports.add(new FlightAirports("A1", "Gdansk","Warszawa", false));
        listOfAirports.add(new FlightAirports("A2", "Warszawa","Gdansk",false));
        listOfAirports.add(new FlightAirports("B1", "Wroclaw","Gdansk",true));
        listOfAirports.add(new FlightAirports("B2", "Gdansk","Wroclaw",true));
        listOfAirports.add(new FlightAirports("C1", "Wroclaw","Warszawa",false));
        listOfAirports.add(new FlightAirports("c2", "Warszawa","Wroclaw",true));

        return listOfAirports;

    }
}
