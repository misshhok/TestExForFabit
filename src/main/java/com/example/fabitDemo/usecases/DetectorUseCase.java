package com.example.fabitDemo.usecases;

import com.example.fabitDemo.entity.*;

import com.example.fabitDemo.entity.exceptions.StateChangeException;
import com.example.fabitDemo.usecases.Exceptions.UseCaseException;


import java.io.IOException;


public class DetectorUseCase extends JsonDataStorage {

    public void DetectorInit(String serialNumber, String model, ConformityCertificateEntity conformityCertificate) throws UseCaseException, IOException {
        if (checkIfExists()) {
            DetectorEntity entity = new DetectorEntity();
            entity.Init(serialNumber, model, conformityCertificate);
            write(entity);
        } else {
            throw new UseCaseException("Ошибка в параметрах запроса. Запрос не следует повторять");
        }
    }



    public void DetectorActive(String address, GpsCoordEntity location, ZoneEntity zone) throws StateChangeException, IOException {
        DetectorEntity entity = read();
        entity.Activate(address, location, zone);
        write(entity);
    }

    public void DetectorSetup() throws StateChangeException, IOException {
        DetectorEntity entity = read();
        entity.Setup();
        write(entity);
    }

    public void DetectorReset() throws IOException, StateChangeException {
        DetectorEntity entity = read();
        entity.Reset();
        write(entity);
    }

    public DetectorEntity getDetector() {
        DetectorEntity entity = read();
        return entity;
    }
}
