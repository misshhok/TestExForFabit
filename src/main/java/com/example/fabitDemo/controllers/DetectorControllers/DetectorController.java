package com.example.fabitDemo.controllers.DetectorControllers;

import com.example.fabitDemo.entity.exceptions.ValidationException;
import com.example.fabitDemo.usecases.DetectorUseCase;
import com.example.fabitDemo.controllers.JsonObjects.DetectorActivateJson;
import com.example.fabitDemo.controllers.JsonObjects.DetectorInitJson;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
public class DetectorController {
    DetectorUseCase detectorUseCase = new DetectorUseCase();


    @GetMapping(value = "/api/detector", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity getDetector() {
        try {
            return ResponseEntity.ok().body(detectorUseCase.getDetector());
        }
        catch (Exception e) {
            return ResponseEntity.badRequest().body("Ошибка в параметрах запроса. Запрос не следует повторять");
        }
    }

    @PutMapping( value = "/api/detector/initialized", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity detectorInitialize(@RequestBody DetectorInitJson detectorInitJSON) {
        try {
            detectorUseCase.DetectorInit(detectorInitJSON.getSerialNumber(), detectorInitJSON.getModel(), detectorInitJSON.getConformityCertificate());
            return ResponseEntity.ok().body("успешная инициализация дектора");
        }
        catch (Exception e) {
            return ResponseEntity.badRequest().body("Ошибка в параметрах запроса. Запрос не следует повторять");
        }
    }

    @PutMapping(value ="/api/detector/active", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity detectorActivate(@RequestBody DetectorActivateJson detectorActivateJson) {
        try {
            detectorUseCase.DetectorActive(detectorActivateJson.getAddress(), detectorActivateJson.getLocation(), detectorActivateJson.getZone());
            return ResponseEntity.ok().body("Успешная активация детектора");
        }
        catch (Exception e) {
            return ResponseEntity.badRequest().body("Ошибка в параметрах запроса. Запрос не следует повторять");
        }
    }

    @PutMapping(value ="/api/detector/setup", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity detectorSetup() {
        try {
            return ResponseEntity.ok().body(detectorUseCase.DetectorSetup());
        }
        catch (Exception e) {
            return ResponseEntity.badRequest().body("Ошибка в параметрах запроса. Запрос не следует повторять");
        }
    }


    @PutMapping(value ="/api/detector/reset", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity detectorReset() {
        try {
            return ResponseEntity.ok().body(detectorUseCase.DetectorReset());
        }
        catch (Exception e) {
            return ResponseEntity.badRequest().body("Ошибка в параметрах запроса. Запрос не следует повторять");
        }
    }

}
