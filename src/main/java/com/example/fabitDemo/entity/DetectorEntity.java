package com.example.fabitDemo.entity;

public class DetectorEntity {

    private State state;
    private String serialNumber;
    private String model;
    private String address;
    public ZoneEntity zone;


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
