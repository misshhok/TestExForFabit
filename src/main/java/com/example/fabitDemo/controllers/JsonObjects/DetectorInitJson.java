package com.example.fabitDemo.controllers.JsonObjects;

import com.example.fabitDemo.entity.ConformityCertificateEntity;

public class DetectorInitJson {
    private String serialNumber;
    private String model;
    private ConformityCertificateEntity conformityCertificate;

    public DetectorInitJson() {
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

    public ConformityCertificateEntity getConformityCertificate() {
        return conformityCertificate;
    }

    public void setConformityCertificate(ConformityCertificateEntity conformityCertificate) {
        this.conformityCertificate = conformityCertificate;
    }
}
