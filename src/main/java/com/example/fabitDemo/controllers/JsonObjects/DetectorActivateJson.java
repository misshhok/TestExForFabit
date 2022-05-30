package com.example.fabitDemo.controllers.JsonObjects;

import com.example.fabitDemo.entity.GpsCoordEntity;
import com.example.fabitDemo.entity.ZoneEntity;

public class DetectorActivateJson {
    private String address;
    private GpsCoordEntity location;
    private ZoneEntity zone;

    public DetectorActivateJson() {
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

    public ZoneEntity getZone() {
        return zone;
    }

    public void setZone(ZoneEntity zone) {
        this.zone = zone;
    }
}
