package com.prep.prep.oops;

public class AbstractClassCar extends Vehicle implements  Abstraction {

    public AbstractClassCar(String brand, int speed) {
        super(brand, speed);
    }

    public String startEngine() {
        return "Car started";
    }
}
