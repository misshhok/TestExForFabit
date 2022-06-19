package com.example.fabitDemo.entity.validators;

import com.example.fabitDemo.entity.GpsCoordEntity;
import com.example.fabitDemo.entity.PointEntity;
import com.example.fabitDemo.entity.exceptions.ValidationException;

import java.util.ArrayList;

public class ZoneValidator {


    public static void validLocation(GpsCoordEntity location) throws ValidationException {
        try {
            GpsCoordValidator.validLongitude(location.getLongitude());
            GpsCoordValidator.validLatitude(location.getLatitude());
        }
        catch (ValidationException e)  {
            e.getMessage();
        }
    }

    public static void validVrpDetectionArea(ArrayList<PointEntity> vrpDetectionArea) throws ValidationException {
        try {
            for (PointEntity point : vrpDetectionArea) {
                PointValidator.validX(point.getX());
                PointValidator.validY(point.getY());
            }
        }
        catch (ValidationException e) {
            e.getMessage();
        }
    }
}
