package com.example.fabitDemo.entity;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ConformityCertificateEntityTest {

    @Test
    void setNumber() {
        ConformityCertificateEntity entity = new ConformityCertificateEntity();
        String actual = "578202343";
        entity.setNumber(actual);
        String result = entity.getNumber();
        assertEquals(result, actual);
    }

    @Test
    void setNumber2() {
        ConformityCertificateEntity entity = new ConformityCertificateEntity();
        String actual = "111111111111111111111111111111111111111111111111111111111111111111111111111";
        entity.setNumber(actual);
        String result = entity.getNumber();
        assertEquals(result, null);
    }

    @Test
    void testSetNumber() {
    }
}