package com.example.fabitDemo.entity;

import com.example.fabitDemo.entity.exceptions.ValidationException;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class DetectorEntityTest {

    @Test
    void setSerialNumber() {
        DetectorEntity entity = new DetectorEntity();
        String actual = "183302";
        entity.setSerialNumber(actual);
        String result = entity.getSerialNumber();
        assertEquals(result, actual);
    }

    @Test
    void setSerialNumber2() {
        DetectorEntity entity = new DetectorEntity();
        String actual = "1459";
        entity.setSerialNumber(actual);
        String result = entity.getSerialNumber();
        assertEquals(result, null);
    }

    @Test
    void setModel() {
        DetectorEntity entity = new DetectorEntity();
        String actual = "Спектр-Д";
        entity.setModel(actual);
        String result = entity.getModel();
        assertEquals(result, actual);
    }

    @Test
    void setModel2() {
        DetectorEntity entity = new DetectorEntity();
        String actual = "Спектр-Д-Спектр_А-ЕЕЕЕЕЕ-ТТРРРРТТТТТТТ_ФФФФФФФФФ-вввввСпектр-Д-Спектр_А-ЕЕЕЕЕЕ-ТТРРРРТТТТТТТ_ФФФФФФФФФ-ввввв";
        entity.setModel(actual);
        String result = entity.getModel();
        assertEquals(result, null);
    }


}