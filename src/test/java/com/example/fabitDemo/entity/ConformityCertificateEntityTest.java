package com.example.fabitDemo.entity;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ConformityCertificateEntityTest {

    @Test
    void getNumber() {
        ConformityCertificateEntity entity = new ConformityCertificateEntity();
        String actual = "57820-2";
        entity.setNumber(actual);
        String result = entity.getNumber();
        assertEquals(result, actual);
    }

    @Test
    void setNumber() {
        ConformityCertificateEntity entity = new ConformityCertificateEntity();
        String actual = "57820-2";
        entity.setNumber(actual);
        String result = entity.getNumber();
        assertEquals(result, actual);
    }

    @Test
    void getExpirationDate() {
        ConformityCertificateEntity entity = new ConformityCertificateEntity();
        Date actual = new Date(2022-1900, 10, 11);
        entity.setExpirationDate(actual);
        Date result = entity.getExpirationDate();
        assertEquals(result, actual);
    }

    @Test
    void setExpirationDate() {
        ConformityCertificateEntity entity = new ConformityCertificateEntity();
        Date actual = new Date(2022-1900, 10, 11);
        entity.setExpirationDate(actual);
        Date result = entity.getExpirationDate();
        assertEquals(result, actual);
    }
}