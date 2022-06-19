package com.example.fabitDemo.entity;

import com.example.fabitDemo.entity.exceptions.ValidationException;
import com.example.fabitDemo.entity.validators.GpsCoordValidator;

public class GpsCoordEntity {
    private double latitude;
    private double longitude;


    public GpsCoordEntity() {
    }

    public GpsCoordEntity(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }




    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        try {
            GpsCoordValidator.validLatitude(latitude);
            this.latitude = latitude;
        }
        catch (ValidationException e) {
            e.getMessage();
        }
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        try {
            GpsCoordValidator.validLatitude(longitude);
            this.longitude = longitude;
        }
        catch (ValidationException e) {
            e.getMessage();
        }
    }

}
