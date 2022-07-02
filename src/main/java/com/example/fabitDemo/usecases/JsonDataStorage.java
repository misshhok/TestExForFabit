package com.example.fabitDemo.usecases;

import com.example.fabitDemo.entity.DetectorEntity;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//@Component
public class JsonDataStorage implements DataStorage{

//    @Value("${com.example.fabitDemo.jsonFileName}")
    private String jsonFileName = "/Users/michaelsmirnov/Desktop/java/fabit_test/java/fabit/fabitProject/src/main/java/com/example/fabitDemo/frameworks/dataStroges/test.json";
    public DetectorEntity read() {
        try (FileReader reader = new FileReader(jsonFileName)) {
            Gson gson = new Gson();
            DetectorEntity entity = gson.fromJson(reader, DetectorEntity.class);
            return entity;
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }


    public void write(DetectorEntity entity) throws IOException {
        FileWriter file = new FileWriter(jsonFileName);
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            file.write(gson.toJson(entity));
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
            file.flush();
            file.close();
        }
    }

    public boolean checkIfExists() {
        try(BufferedReader br = new BufferedReader(new FileReader(jsonFileName))) {
            if (br.readLine() == "") {
                System.out.println("No errors, and file empty");
                return false;
            }
            else {
                return true;
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}
