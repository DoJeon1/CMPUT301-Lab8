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
    void testAdd() {
        CityList cityList = testList();

        assertEquals(1, cityList.countCities());

        City toBeDeleted = new City("Regina", "Saskatchewan");

        cityList.add(toBeDeleted);

        cityList.delete(toBeDeleted);

        assertEquals(1, cityList.countCities());
    }
}
