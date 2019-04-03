package com.kodilla.testing.weather.stub;//klasy znajdujące się w jednym pakiecie nie muszą się "importować",

import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {//Zadaniem tej klasy jest obliczenie prognozy
    // pogody na podstawie danych z czujników temperatury.
    Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures){
        this.temperatures = temperatures;
    }

    public HashMap<Integer, Double> calculateForecast() {
        HashMap<Integer, Double> resultMap = new HashMap<Integer, Double>();

        for(Map.Entry<Integer, Double> temperature :
                temperatures.getTemperatures().entrySet()){

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1);// nasza prognoza polega na razie po
            // prostu na dodaniu 1 stopnia do wyników z każdego czujnika temperatury
        }
        return resultMap;
    }
}