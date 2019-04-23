package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Asia - Afghanistan, Armenia, Bhutan
        //Europe - Germany, Sweden, Switzerland
        //North America - United States of America, Mexico, Cuba

        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");
        Continent northAmerica = new Continent("North America");

        Country afghanistan = new Country("Afghanistan", BigDecimal.valueOf(34656032));
        Country armenia = new Country("Armenia", BigDecimal.valueOf(2924816));
        Country bhutan = new Country("Bhutan", BigDecimal.valueOf(727145));

        Country germany = new Country("Germany", BigDecimal.valueOf(10));
        Country sweden = new Country("Sweden", BigDecimal.valueOf(10));
        Country switzerland = new Country("Switzerland", BigDecimal.valueOf(10));

        Country usa = new Country("USA", BigDecimal.valueOf(10));
        Country mexico = new Country("Mexico", BigDecimal.valueOf(10));
        Country cuba = new Country("Cuba", BigDecimal.valueOf(10));

        World world = new World();

        europe.addCountryName(germany);
        europe.addCountryName(sweden);
        europe.addCountryName(switzerland);

        asia.addCountryName(afghanistan);
        asia.addCountryName(armenia);
        asia.addCountryName(bhutan);

        northAmerica.addCountryName(usa);
        northAmerica.addCountryName(mexico);
        northAmerica.addCountryName(cuba);

        world.addContinentWorld(europe);
        world.addContinentWorld(asia);
        world.addContinentWorld(northAmerica);





        //Given
        BigDecimal allPeopleQuantity = world.getPeopleQuantity();

        //When

        BigDecimal allPeopleExpected = new BigDecimal("90");


        //Then
        Assert.assertEquals(allPeopleExpected, allPeopleQuantity);


    }
}