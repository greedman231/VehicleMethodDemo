package com.company;

public class Vehicle {
    int passangers;
    int wheels;
    int maxspeed;
    int burnup;

    void distance(double interval){
        double value = maxspeed * interval;
        System.out.println("Пройдёт путь, равный" + value + "км");
    }
}
