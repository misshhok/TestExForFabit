package com.example.fabitDemo.controllers.DetectorControllers;


import com.example.fabitDemo.usecases.DetectorUseCase;
import com.example.fabitDemo.controllers.JsonObjects.DetectorActivateJson;
import com.example.fabitDemo.controllers.JsonObjects.DetectorInitJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DetectorController {
    @Autowired
    DetectorUseCase detectorUseCase = new DetectorUseCase();


    @GetMapping("/api/detector")
    public ResponseEntity getDetector() {
        try {
            return ResponseEntity.ok().body("Успешное получение детектора\n" + detectorUseCase.getDetector());
        }
        catch (Exception e) {
            return ResponseEntity.badRequest().body("Something was wrong");
        }
    }

    @PutMapping("/api/detector/initialized")
    public ResponseEntity detectorInitialize(@RequestBody DetectorInitJson detectorInitJSON) {
        try {
            detectorUseCase.DetectorInit(detectorInitJSON.getSerialNumber(), detectorInitJSON.getModel(), detectorInitJSON.getConformityCertificate());
            return ResponseEntity.ok().body("Успешная инициализация детектора");
        }
        catch (Exception e) {
            return ResponseEntity.badRequest().body("Something was wrong");
        }
    }

    @PutMapping("/api/detector/active")
    public ResponseEntity detectorActivate(@RequestBody DetectorActivateJson detectorActivateJson) {
        try {
            detectorUseCase.DetectorActive(detectorActivateJson.getAddress(), detectorActivateJson.getLocation(), detectorActivateJson.getZone());
            return ResponseEntity.ok().body("Успешная активация детектора");
        }
        catch (Exception e) {
            return ResponseEntity.badRequest().body("Something was wrong");
        }
    }

    @PutMapping("/api/detector/setup")
    public ResponseEntity detectorSetup() {
        try {
            detectorUseCase.DetectorSetup();
            return ResponseEntity.ok().body("Успешный перевод в настройку");
        }
        catch (Exception e) {
            return ResponseEntity.badRequest().body("Something was wrong");
        }
    }


    @PutMapping("/api/detector/reset")
    public ResponseEntity detectorReset() {
        try {
            detectorUseCase.DetectorReset();
            return ResponseEntity.ok().body("Успешный сброс настроек");
        }
        catch (Exception e) {
            return ResponseEntity.badRequest().body("Something was wrong");
        }
    }

}
