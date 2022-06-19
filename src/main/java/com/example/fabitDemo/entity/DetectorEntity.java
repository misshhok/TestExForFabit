package com.example.fabitDemo.entity;

import com.example.fabitDemo.entity.exceptions.StateChangeException;
import com.example.fabitDemo.entity.exceptions.ValidationException;
import com.example.fabitDemo.entity.validators.DetectorValidator;

public class DetectorEntity {
    private State state;
    private String serialNumber;
    private String model;
    private String address;
    private ZoneEntity zone;

    private GpsCoordEntity location;


    public ConformityCertificateEntity conformityCertificate;

    public DetectorEntity() {
    }

    public DetectorEntity( State state, String serialNumber, String model, ConformityCertificateEntity conformityCertificate, String address) {
        this.state = state;
        this.serialNumber = serialNumber;
        this.model = model;
        this.conformityCertificate = conformityCertificate;
        this.address = address;
    }

    public GpsCoordEntity getLocation() {
        return location;
    }

    public void setLocation(GpsCoordEntity location) {
        try {
            if (location == null) {
                this.location = null;
            }
            else {
                DetectorValidator.validLocation(location);
                this.location = location;
            }
        }
        catch (ValidationException e) {
            e.getMessage();
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        try {
            DetectorValidator.validSerialNumber(serialNumber);
            this.serialNumber = serialNumber;
        }
        catch (ValidationException e) {
            e.getMessage();
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        try {
            DetectorValidator.validModel(model);
            this.model = model;
        }
        catch (ValidationException e) {
            e.getMessage();
        }
    }

    public ZoneEntity getZone() {
        return zone;
    }

    public void setZone(ZoneEntity zone) {
        try {
            if (zone == null) {
                this.zone = null;
            }
            else {
                DetectorValidator.validZone(zone);
                DetectorValidator.validZoneLocation(zone, this.location);
                this.zone = zone;
            }
        }
        catch (ValidationException e) {
            e.getMessage();
        }
    }

    public ConformityCertificateEntity getConformityCertificate() {
        return conformityCertificate;
    }

    public void setConformityCertificate(ConformityCertificateEntity conformityCertificate) {
        this.conformityCertificate = conformityCertificate;
    }

    public void Init(String serialNumber, String model, ConformityCertificateEntity conformityCertificate) {
        this.setSerialNumber(serialNumber);
        this.setModel(model);
        this.setConformityCertificate(conformityCertificate);
        this.setState(State.NEW);
    }

    public void Setup() throws StateChangeException {
        if ((this.getState() == State.ACTIVE) || (this.getState() == State.NEW)) {
            this.setState(State.SETUP);
        }
        else {
            throw new StateChangeException("Ошибка перевода детектора в настройку");
        }
    }

    public void Reset () throws StateChangeException {
        if (this.getState() == State.SETUP) {
            this.setState(State.NEW);
            this.setZone(null);
            this.setAddress(null);
            this.setLocation(null);
        }
        else {
            throw new StateChangeException("Ошибка перевода детектора в настройку");
        }
    }

    public void Activate() throws StateChangeException {
        if (this.getState() == State.SETUP) {
            this.setLocation(location);
            this.setAddress(address);
            this.setZone(zone);
            this.setState(State.ACTIVE);
        }
        else {
            throw new StateChangeException("Ошибка перевода детектора в настройку");
        }
    }
}
