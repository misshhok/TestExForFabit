package com.example.fabitDemo.usecases;

import com.example.fabitDemo.entity.*;
import com.example.fabitDemo.entity.exceptions.StateChangeException;

import java.io.IOException;


public class DetectorUseCase extends JsonDataStorage {
    public void DetectorInit(String serialNumber, String model, ConformityCertificateEntity conformityCertificate)  {
        try {
            if (checkIfExists()) {
                DetectorEntity entity = new DetectorEntity();
                entity.Init(serialNumber, model, conformityCertificate);
                write(entity);
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }



    public void DetectorActive(String address, GpsCoordEntity location, ZoneEntity zone) {
        try {
            DetectorEntity entity = read();
            entity.Activate(address, location, zone);
            write(entity);
        }
        catch (StateChangeException stateChangeException) {
            System.out.println(stateChangeException.getMessage());
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public String DetectorSetup() {
        try {
            DetectorEntity entity = read();
            entity.Setup();
            write(entity);
            return "Успешный перевод в настройку";
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        catch (StateChangeException e) {
            System.out.println(e.getMessage());
        }
        return "Ошибка перевода в настройку";
    }

    public String DetectorReset() {
        try {
                DetectorEntity entity = read();
                entity.Reset();
                write(entity);
                return "Успешный сброс настроек";
            }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        catch (StateChangeException e) {
            System.out.println(e.getMessage());
        }
        return "Ошибка сброса настроек";
    }

    public DetectorEntity getDetector() {
        try {
            DetectorEntity entity = read();
            return entity;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
