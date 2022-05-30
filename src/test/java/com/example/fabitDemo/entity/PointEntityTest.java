package com.example.fabitDemo.entity;

import org.junit.jupiter.api.Test;

class PointEntityTest {

    @Test
    void getX() {
        PointEntity entity = new PointEntity();
        int actual = 19;
        entity.setX(actual);
        int result = entity.getX();
    }

    @Test
    void setX() {
        PointEntity entity = new PointEntity();
        int actual = 29;
        entity.setX(actual);
        int result = entity.getX();
    }

    @Test
    void getY() {
        PointEntity entity = new PointEntity();
        int actual = 1001;
        entity.setY(actual);
        int result = entity.getY();
    }

    @Test
    void setY() {
        PointEntity entity = new PointEntity();
        int actual = 2901;
        entity.setY(actual);
        int result = entity.getY();
    }
}