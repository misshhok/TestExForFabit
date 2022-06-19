package com.example.fabitDemo.entity.validators;

import com.example.fabitDemo.entity.exceptions.ValidationException;

public class GpsCoordValidator {
    public static void validLongitude(double longitude) throws ValidationException {
        if (longitude <= -180 || longitude >= 180) {
            throw new ValidationException("Non-valid longitude(max: 180, min: -180)");
        }
    }

    public static void validLatitude(double latitude) throws ValidationException {
        if (!(latitude <= -90 || latitude >= 90)) {
            throw new ValidationException("Non-valid longitude(max: 180, min: -180)");
        }
    }
}
