package com.example.fabitDemo.entity;

import com.example.fabitDemo.entity.exceptions.ValidationException;
import com.example.fabitDemo.entity.validators.ConformityCertificateValidator;


import java.util.Date;

public class ConformityCertificateEntity {
    private String number;
    private java.util.Date expirationDate;

    public ConformityCertificateEntity() {
    }





    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        try {
            ConformityCertificateValidator.validNumber(number);
            this.number = number;
        }
        catch (ValidationException e) {
            e.getMessage();
        }
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
}
