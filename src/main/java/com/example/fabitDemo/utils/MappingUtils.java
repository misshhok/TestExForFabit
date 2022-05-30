package com.example.fabitDemo.utils;

import com.example.fabitDemo.entity.DetectorEntity;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.stereotype.Service;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



@Service
public class MappingUtils {

    String filePath = "/Users/michaelsmirnov/Desktop/fabit_test/java/fabit/fabitDemo/src/main/java/com/example/fabitDemo/frameworks/dataStroges/test.json";
    public DetectorDTO mapEntityToDTO (DetectorEntity entity) {
        DetectorDTO dto = new DetectorDTO();
        dto.setAddress(entity.getAddress());
        dto.setConformityCertificate(entity.getConformityCertificate());
        dto.setModel(entity.getModel());
        dto.setState(entity.getState());
        dto.setSerialNumber(entity.getSerialNumber());
        dto.setZone(entity.getZone());
        return dto;
    }

    public DetectorEntity mapDTOToEntity (DetectorDTO dto) {
        DetectorEntity entity = new DetectorEntity();
        entity.setConformityCertificate(dto.getConformityCertificate());
        entity.setAddress(dto.getAddress());
        entity.setModel(dto.getModel());
        entity.setState(dto.getState());
        entity.setSerialNumber(dto.getSerialNumber());
        entity.setZone(dto.getZone());
        return entity;
    }

    public void mapDtoToJSON (DetectorDTO dto) throws java.io.IOException {
        FileWriter file = new FileWriter(filePath);
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            file.write(gson.toJson(dto));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            file.flush();
            file.close();
        }
    }


    public DetectorDTO mapJSONtoDTO () throws java.io.IOException {

        try (FileReader reader = new FileReader(filePath)) {

            Gson gson = new Gson();
            DetectorDTO dto = gson.fromJson(reader, DetectorDTO.class);
            return dto;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void mapEntityToJSON (DetectorEntity entity) throws java.io.IOException {
        FileWriter file = new FileWriter("/Users/michaelsmirnov/Desktop/fabit_test/java/fabit/fabitDemoWithSql/src/main/java/com/example/fabitDemoWithSql/frameworks/dataStroges/test.json");
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            file.write(gson.toJson(entity));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            file.flush();
            file.close();
        }
    }


    public DetectorEntity mapJSONtoEntity () throws java.io.IOException {
        try (FileReader reader = new FileReader("/Users/michaelsmirnov/Desktop/fabit_test/java/fabit/fabitDemoWithSql/src/main/java/com/example/fabitDemoWithSql/frameworks/dataStroges/test.json");) {
            Gson gson = new Gson();
            DetectorEntity entity = gson.fromJson(reader, DetectorEntity.class);
            return entity;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
