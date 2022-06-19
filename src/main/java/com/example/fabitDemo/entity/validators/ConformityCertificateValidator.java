package com.example.fabitDemo.entity.validators;

import com.example.fabitDemo.entity.exceptions.ValidationException;
import org.springframework.stereotype.Service;

@Service
public class ConformityCertificateValidator {
    public ConformityCertificateValidator() {
    }

    public static void validNumber(String number) throws ValidationException {
        if (!(number.length() <= 50)) {
            throw new ValidationException("Non-valid number");
        }
    }
}
