package com.example.fabitDemo.usecases;

import com.example.fabitDemo.entity.DetectorEntity;
import com.example.fabitDemo.entity.exceptions.StateChangeException;

import java.io.IOException;

public interface DataStorage {
    public DetectorEntity read();
    public void write(DetectorEntity entity) throws IOException, StateChangeException;

    public boolean checkIfExists();
}
