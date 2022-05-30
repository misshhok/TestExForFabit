package com.example.fabitDemo.entity;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ZoneEntityTest {

    @Test
    void getAddress() {
        ZoneEntity entity = new ZoneEntity();
        String actual = "Россия, г.Белгород, ул.Первомайская, д.6";
        entity.setAddress(actual);
        String result = entity.getAddress();
        assertEquals(result, actual);
    }

    @Test
    void setAddress() {
        ZoneEntity entity = new ZoneEntity();
        String actual = "Россия, г.Белгород, ул.Первомайская, д.6";
        entity.setAddress(actual);
        String result = entity.getAddress();
        assertEquals(result, actual);
    }

    @Test
    void getLocation() {
        ZoneEntity entity = new ZoneEntity();

        GpsCoordEntity actual = new GpsCoordEntity();
        double Longitude = 1.0;
        double Latitude = 2.0;
        actual.setLongitude(Longitude);
        actual.setLatitude(Latitude);
        entity.setLocation(actual);

        GpsCoordEntity result = entity.getLocation();
        assertEquals(result, actual);
    }

    @Test
    void setLocation() {
        ZoneEntity entity = new ZoneEntity();

        GpsCoordEntity actual = new GpsCoordEntity();
        double Longitude = 34.0;
        double Latitude = 19.0;
        actual.setLongitude(Longitude);
        actual.setLatitude(Latitude);
        entity.setLocation(actual);

        GpsCoordEntity result = entity.getLocation();
        assertEquals(result, actual);
    }

    @Test
    void getVrpDetectionArea() {
        ZoneEntity entity = new ZoneEntity();

        PointEntity point1 = new PointEntity(1, 1);
        PointEntity point2 = new PointEntity(100, 200);
        ArrayList<PointEntity> actual = new ArrayList<PointEntity>();
        actual.add(point1);
        actual.add(point2);

        entity.setVrpDetectionArea(actual);
        ArrayList<PointEntity> result = entity.getVrpDetectionArea();
        assertEquals(result, actual);
    }

    @Test
    void setVrpDetectionArea() {
        ZoneEntity entity = new ZoneEntity();

        PointEntity point1 = new PointEntity(123, 292);
        PointEntity point2 = new PointEntity(1990, 231);
        ArrayList<PointEntity> actual = new ArrayList<PointEntity>();
        actual.add(point1);
        actual.add(point2);

        entity.setVrpDetectionArea(actual);
        ArrayList<PointEntity> result = entity.getVrpDetectionArea();
        assertEquals(result, actual);
    }
}