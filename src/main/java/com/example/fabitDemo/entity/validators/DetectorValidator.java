package com.example.fabitDemo.entity.validators;

import com.example.fabitDemo.entity.ConformityCertificateEntity;

import com.example.fabitDemo.entity.ZoneEntity;
import com.example.fabitDemo.entity.exceptions.ValidationException;
import com.example.fabitDemo.entity.GpsCoordEntity;
import com.example.fabitDemo.utils.GPSHelper;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DetectorValidator {

    public DetectorValidator() {

    }

    public static void validSerialNumber(String serialNumber) throws ValidationException {
        if (!(serialNumber.length() >= 6 && serialNumber.length() <= 50)) {
            throw new ValidationException("Non-valid serial number");
        }
        else {
            Pattern pattern = Pattern.compile("^[a-zA-Z0-9-]*$");
            Matcher matcher = pattern.matcher(serialNumber);
            if (!matcher.find()){
                throw new ValidationException("Non-valid serial number");
            }
        }
    }
    public static void validModel(String model) throws ValidationException {
        if (!(model.length() >= 1 && model.length() <= 50)) {
            throw new ValidationException("Non-valid model");
        }
    }

    public static void validLocation(GpsCoordEntity location) throws ValidationException {
        try {
            GpsCoordValidator.validLatitude(location.getLatitude());
            GpsCoordValidator.validLongitude(location.getLongitude());
        }
        catch (ValidationException e) {
            e.getMessage();
        }
    }

    public void validCertificate(ConformityCertificateEntity certificate) throws ValidationException{
        try {
            ConformityCertificateValidator.validNumber(certificate.getNumber());
        }
        catch (ValidationException e) {
            e.getMessage();
        }
    }

    public static void validZone(ZoneEntity zone) throws ValidationException {
        try {
            ZoneValidator.validVrpDetectionArea(zone.getVrpDetectionArea());
            ZoneValidator.validLocation(zone.getLocation());
        }
        catch (ValidationException e) {
            e.getMessage();
        }
    }

    public static void validZoneLocation(ZoneEntity zone, GpsCoordEntity location) throws ValidationException {
        if (!(GPSHelper.GetDistance(zone.getLocation().getLatitude(), zone.getLocation().getLongitude(), location.getLatitude(), location.getLongitude()) <= 0.3)) {
            throw new ValidationException("Non-valid zone");
        }
    }
}
