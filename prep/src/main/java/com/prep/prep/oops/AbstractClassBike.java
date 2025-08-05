package com.prep.prep.oops;

public class AbstractClassBike extends Vehicle implements Abstraction {

    public AbstractClassBike(String brand, int speed) {
        super(brand, speed);
    }

    public String startEngine() {
        return "Bike started";
    }
}
