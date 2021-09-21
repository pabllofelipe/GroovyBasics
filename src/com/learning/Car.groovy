package com.learning

abstract class Car {
    String name
    int model
    String color

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    int getModel() {
        return model
    }

    void setModel(int model) {
        this.model = model
    }

    String getColor() {
        return color
    }

    void setColor(String color) {
        this.color = color
    }

    abstract def topSpeed(int speed)
}
