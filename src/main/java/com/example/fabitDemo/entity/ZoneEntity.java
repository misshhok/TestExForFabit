package com.example.fabitDemo.entity;


import java.util.ArrayList;

public class ZoneEntity {

    private String address;

    public GpsCoordEntity location;

    private ArrayList<PointEntity> vrpDetectionArea;

    public ZoneEntity() {
    }

    public ZoneEntity(String address, GpsCoordEntity location, ArrayList<PointEntity> vrpDetectionArea) {

        this.address = address;
        this.location = location;
        this.vrpDetectionArea = vrpDetectionArea;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public GpsCoordEntity getLocation() {
        return location;
    }

    public void setLocation(GpsCoordEntity location) {
        this.location = location;
    }

    public ArrayList<PointEntity> getVrpDetectionArea() {
        return vrpDetectionArea;
    }

    public void setVrpDetectionArea(ArrayList<PointEntity> vrpDetectionArea) {
        this.vrpDetectionArea = vrpDetectionArea;
    }
}
