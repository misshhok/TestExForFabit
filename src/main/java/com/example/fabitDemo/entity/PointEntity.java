package com.example.fabitDemo.entity;

import com.example.fabitDemo.entity.exceptions.ValidationException;
import com.example.fabitDemo.entity.validators.PointValidator;

public class PointEntity {

    private int x;
    private int y;

    public PointEntity() {
    }

    public PointEntity( int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        try {
            PointValidator.validX(x);
            this.x = x;
        }
        catch (ValidationException e) {
            e.getMessage();
        }
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        try {
            PointValidator.validY(y);
            this.y = y;
        }
        catch (ValidationException e) {
            e.getMessage();
        }
    }
}
