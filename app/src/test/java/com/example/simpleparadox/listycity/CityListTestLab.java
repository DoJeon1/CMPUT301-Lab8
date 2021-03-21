package com.example.simpleparadox.listycity;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class CityListTestLab {

    private CityList testList() {
        CityList cityList = new CityList();
        cityList.add(testCity());
        return cityList;
    }

    private City testCity() {
        return new City("Edmonton", "Alberta");
    }

    @Test
    void testDelete() {
        CityList cityList = testList();

        // Test if the city has been deleted
        assertEquals(0, cityList.countCities());

    }
}
