package com.example.fabitDemo.entity;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class DetectorEntityTest {

    @Test
    void getAddress() {
        DetectorEntity entity = new DetectorEntity();
        String actual = "Россия, г.Белгород, ул.Первомайская, д.6";
        entity.setAddress(actual);
        String result = entity.getAddress();
        assertEquals(result, actual);
    }

    @Test
    void setAddress() {
        DetectorEntity entity = new DetectorEntity();
        String actual = "Россия, г.Белгород, ул.Первомайская, д.6";
        entity.setAddress(actual);
        String result = entity.getAddress();
        assertEquals(result, actual);
    }

    @Test
    void getState() {
        DetectorEntity entity = new DetectorEntity();
        State actual = State.ACTIVE;
        entity.setState(actual);
        State result = entity.getState();
        assertEquals(result, actual);
    }

    @Test
    void setState() {
        DetectorEntity entity = new DetectorEntity();
        State actual = State.NEW;
        entity.setState(actual);
        State result = entity.getState();
        assertEquals(result, actual);
    }

    @Test
    void getSerialNumber() {
        DetectorEntity entity = new DetectorEntity();
        String actual = "183302";
        entity.setSerialNumber(actual);
        String result = entity.getSerialNumber();
        assertEquals(result, actual);

    }

    @Test
    void setSerialNumber() {
        DetectorEntity entity = new DetectorEntity();
        String actual = "183302";
        entity.setSerialNumber(actual);
        String result = entity.getSerialNumber();
        assertEquals(result, actual);
    }

    @Test
    void getModel() {
        DetectorEntity entity = new DetectorEntity();
        String actual = "Спектр-Д";
        entity.setModel(actual);
        String result = entity.getModel();
        assertEquals(result, actual);
    }

    @Test
    void setModel() {
        DetectorEntity entity = new DetectorEntity();
        String actual = "Спектр-Д";
        entity.setModel(actual);
        String result = entity.getModel();
        assertEquals(result, actual);
    }

    @Test
    void getZone() {
        DetectorEntity entity = new DetectorEntity();

        GpsCoordEntity coord = new GpsCoordEntity(1.0 , 2.0);
        PointEntity point1 = new PointEntity(1, 1);
        PointEntity point2 = new PointEntity(100, 200);
        ArrayList<PointEntity> points = new ArrayList<PointEntity>();
        points.add(point1);
        points.add(point2);
        ZoneEntity actual = new ZoneEntity("Россия, г.Белгород, ул.Первомайская, д.6", coord, points);
        entity.setZone(actual);
        ZoneEntity result = entity.getZone();
        assertEquals(result, actual);
    }

    @Test
    void setZone() {
        DetectorEntity entity = new DetectorEntity();
        GpsCoordEntity coord = new GpsCoordEntity(1.0 , 2.0);
        PointEntity point1 = new PointEntity(1, 1);
        PointEntity point2 = new PointEntity(100, 200);
        ArrayList<PointEntity> points = new ArrayList<PointEntity>();
        points.add(point1);
        points.add(point2);
        ZoneEntity actual = new ZoneEntity("Россия, г.Белгород, ул.Первомайская, д.6", coord, points);
        entity.setZone(actual);
        ZoneEntity result = entity.getZone();
        assertEquals(result, actual);
    }

    @Test
    void getConformityCertificate() {
        DetectorEntity entity = new DetectorEntity();
        Date date = new Date(2022-1900, 10, 11);
        ConformityCertificateEntity actual = new ConformityCertificateEntity("98558-1", date);
        entity.setConformityCertificate(actual);
        ConformityCertificateEntity result = entity.getConformityCertificate();
        assertEquals(result, actual);
    }

    @Test
    void setConformityCertificate() {
        DetectorEntity entity = new DetectorEntity();
        Date date = new Date(2022-1900, 10, 11);
        ConformityCertificateEntity actual = new ConformityCertificateEntity("98558-1", date);
        entity.setConformityCertificate(actual);
        ConformityCertificateEntity result = entity.getConformityCertificate();
        assertEquals(result, actual);
    }
}