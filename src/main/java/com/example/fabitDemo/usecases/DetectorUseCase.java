package com.example.fabitDemo.usecases;

import com.example.fabitDemo.entity.*;
import com.example.fabitDemo.utils.MappingUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class DetectorUseCase {
    MappingUtils mappingUtils = new MappingUtils();

    public String DetectorInit(String serialNumber, String model, ConformityCertificateEntity conformityCertificate)  {
        try {
            if (mappingUtils.FileIsEmpty()) {
                DetectorEntity entity = new DetectorEntity();
                entity.setSerialNumber(serialNumber);
                entity.setModel(model);
                entity.setConformityCertificate(conformityCertificate);
                entity.setState(State.NEW);
                mappingUtils.mapEntityToJSON(entity);
                return "Успешная инициализация детектора";
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return "Ошибка инициализации детектора";
    }

    public String DetectorActive(String address, GpsCoordEntity location, ZoneEntity zone) {
        try {
            DetectorEntity entity = mappingUtils.mapJSONtoEntity();
            if (entity.getState() == State.SETUP) {
                entity.setLocation(location);
                entity.setAddress(address);
                entity.setZone(zone);
                entity.setState(State.ACTIVE);
                mappingUtils.mapEntityToJSON(entity);
                return "Успешная активация детектора";
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return "Ошибка активации детектора";
    }

    public String DetectorSetup() {
        try {
            DetectorEntity entity = mappingUtils.mapJSONtoEntity();
            if ((entity.getState() == State.ACTIVE) || (entity.getState() == State.NEW)) {
                entity.setState(State.SETUP);
                mappingUtils.mapEntityToJSON(entity);
                return "Успешный перевод в настройку";
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return "Ошибка перевода в настройку";
    }

    public String DetectorReset() {
        try {
            DetectorEntity entity = mappingUtils.mapJSONtoEntity();
            if (entity.getState() == State.SETUP) {
                entity.setState(State.NEW);
                entity.setZone(null);
                entity.setAddress(null);
                entity.setLocation(null);
                mappingUtils.mapEntityToJSON(entity);
                return "Успешный сброс настроек";
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return "Ошибка сброса настроек";
    }

    public DetectorEntity getDetector() {
        try {
            DetectorEntity entity = mappingUtils.mapJSONtoEntity();
            return entity;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
