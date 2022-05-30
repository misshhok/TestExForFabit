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
    public void DetectorInit(String serialNumber, String model, ConformityCertificateEntity conformityCertificate) {
        try {

            DetectorEntity entity = new DetectorEntity();

            entity.setSerialNumber(serialNumber);
            entity.setModel(model);
            entity.setConformityCertificate(conformityCertificate);
            entity.setState(State.NEW);

            mappingUtils.mapEntityToJSON(entity);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void DetectorActive(String address, GpsCoordEntity location, ZoneEntity zone) {
        try {
            DetectorEntity entity = mappingUtils.mapJSONtoEntity();
            entity.setAddress(address);
            entity.setZone(zone);
            entity.setState(State.ACTIVE);
            mappingUtils.mapEntityToJSON(entity);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void DetectorSetup() {
        try {
            DetectorEntity entity = mappingUtils.mapJSONtoEntity();
            entity.setState(State.SETUP);
            mappingUtils.mapEntityToJSON(entity);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void DetectorReset() {
        try {

            DetectorEntity entity = mappingUtils.mapJSONtoEntity();
            entity.setState(State.SETUP);
            entity.setZone(null);
            entity.setAddress(null);
            mappingUtils.mapEntityToJSON(entity);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getDetector() {
        try {
            DetectorEntity entity = mappingUtils.mapJSONtoEntity();
            if (entity != null) {
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                String response = gson.toJson(entity);
                return response;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
