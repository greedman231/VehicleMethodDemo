package com.company;

public class VehicleMethodDemo {

    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.passangers = 2;
        car.wheels = 4;
        car.maxspeed = 130;
        car.burnup = 30;

        Vehicle bus = new Vehicle();
        bus.passangers = 45;
        bus.wheels =4;
        bus.maxspeed = 100;

        double time = 0.5;
        System.out.print("автомобиль с" + car.passangers + " пассажирами");
        car.distance(time);
        System.out.print("автобус с" + bus.passangers + " пассажирами");
        bus.distance(time);
    }
}
