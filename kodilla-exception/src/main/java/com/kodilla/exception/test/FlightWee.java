package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightWee {
    public void findFlight (Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airports = new HashMap<> (  );

        airports.put ( "New York", true );
        airports.put ( "Los Angeles", false );
        airports.put ( "Sydney", true );

        if (airports.get ( flight.getArrivalAirport () ) && airports.get ( flight.getDepartureAirport () )  ) {
                System.out.println ( "Good to go!" );
        }
        else {
            throw new RouteNotFoundException ();
        }
    }

    public static void main (String[] args) {

        FlightWee flightWee = new FlightWee();
//be bledu
        try {
            flightWee.findFlight ( new Flight ( "New York", "Sydney" ) );
        } catch (RouteNotFoundException e) {
            System.out.println ( "Flight not found! Try another one!" );
        } finally {
            System.out.println ( "Have a nice flight!" );
        }

        FlightWee flightWee2 = new FlightWee();
//z bledem
        try {
            flightWee2.findFlight ( new Flight ( "New York", "Los Angeles" ) );
        } catch (RouteNotFoundException e) {
            System.out.println ( "Flight not found! Try another one!" );
        } finally {
            System.out.println ( "Have a nice flight!" );
        }


    }
}
