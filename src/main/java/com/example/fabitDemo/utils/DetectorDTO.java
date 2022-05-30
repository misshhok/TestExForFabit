package com.example.fabitDemo.utils;

import com.example.fabitDemo.entity.ConformityCertificateEntity;
import com.example.fabitDemo.entity.State;
import com.example.fabitDemo.entity.ZoneEntity;

public class DetectorDTO {

    //    TODO: сделать unit-tests на DTO объекты
    private State state;
    private String address;
    private String serialNumber;
    private String model;
    public ZoneEntity zone;
    public ConformityCertificateEntity conformityCertificate;

    public DetectorDTO() {
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
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public ZoneEntity getZone() {
        return zone;
    }

    public void setZone(ZoneEntity zone) {
        this.zone = zone;
    }

    public ConformityCertificateEntity getConformityCertificate() {
        return conformityCertificate;
    }

    public void setConformityCertificate(ConformityCertificateEntity conformityCertificate) {
        this.conformityCertificate = conformityCertificate;
    }
}
