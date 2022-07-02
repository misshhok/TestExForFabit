package com.example.fabitDemo.usecases;

import com.example.fabitDemo.entity.DetectorEntity;

import java.io.IOException;

public interface DataStorage {
    public DetectorEntity read();
    public void write(DetectorEntity entity) throws IOException;

    public boolean checkIfExists();
}
