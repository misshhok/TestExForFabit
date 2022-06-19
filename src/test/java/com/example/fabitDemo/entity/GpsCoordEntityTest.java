package com.example.fabitDemo.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GpsCoordEntityTest {


    @Test
    void setLatitude() {
        GpsCoordEntity entity = new GpsCoordEntity();
        double actual = 53.0;
        entity.setLatitude(actual);
        double result = entity.getLatitude();
        assertEquals(result,actual);
    }

    @Test
    void setLatitude1() {
        GpsCoordEntity entity = new GpsCoordEntity();
        double actual = 10000.0;
        entity.setLatitude(actual);
        double result = entity.getLatitude();
        assertEquals(result,null);
    }

    @Test
    void setLatitude2() {
        GpsCoordEntity entity = new GpsCoordEntity();
        double actual = -10000.0;
        entity.setLatitude(actual);
        double result = entity.getLatitude();
        assertEquals(result,null);
    }



    @Test
    void setLongitude() {
        GpsCoordEntity entity = new GpsCoordEntity();
        double actual = 13.6;
        entity.setLongitude(actual);
        double result = entity.getLongitude();
        assertEquals(result,actual);
    }

    @Test
    void setLongitude1() {
        GpsCoordEntity entity = new GpsCoordEntity();
        double actual = -2332.6;
        entity.setLongitude(actual);
        double result = entity.getLongitude();
        assertEquals(result,actual);
    }
}