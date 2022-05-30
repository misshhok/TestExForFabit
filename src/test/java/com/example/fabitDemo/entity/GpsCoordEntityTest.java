package com.example.fabitDemo.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GpsCoordEntityTest {

    @Test
    void getLatitude() {
        GpsCoordEntity entity = new GpsCoordEntity();
        double actual = 48.9;
        entity.setLatitude(actual);
        double result = entity.getLatitude();
        assertEquals(result,actual);
    }

    @Test
    void setLatitude() {
        GpsCoordEntity entity = new GpsCoordEntity();
        double actual = 53.0;
        entity.setLatitude(actual);
        double result = entity.getLatitude();
        assertEquals(result,actual);
    }

    @Test
    void getLongitude() {
        GpsCoordEntity entity = new GpsCoordEntity();
        double actual = 49.9;
        entity.setLongitude(actual);
        double result = entity.getLongitude();
        assertEquals(result,actual);
    }

    @Test
    void setLongitude() {
        GpsCoordEntity entity = new GpsCoordEntity();
        double actual = 13.6;
        entity.setLongitude(actual);
        double result = entity.getLongitude();
        assertEquals(result,actual);
    }
}