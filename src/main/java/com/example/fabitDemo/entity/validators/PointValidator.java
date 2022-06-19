package com.example.fabitDemo.entity.validators;

import com.example.fabitDemo.entity.exceptions.ValidationException;

public class PointValidator {
    public static void validX(int x) throws ValidationException {
        if (!(x > 0 && x <= 3840)) {
            throw new ValidationException("Non-valid x");
        }
    }

    public static void validY(int y) throws ValidationException {
        if (!(y > 0 && y <= 2160)) {
            throw new ValidationException("Non-valid y");
        }
    }
}
