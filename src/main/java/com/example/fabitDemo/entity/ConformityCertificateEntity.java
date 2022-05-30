package com.example.fabitDemo.entity;

import java.util.Date;
public class ConformityCertificateEntity {

    private String number;
    private java.util.Date expirationDate;

    public ConformityCertificateEntity() {
    }

    public ConformityCertificateEntity(String number, Date expirationDate) {
        this.number = number;
        this.expirationDate = expirationDate;
    }




    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
}
