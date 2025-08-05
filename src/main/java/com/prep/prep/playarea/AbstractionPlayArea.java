package com.prep.prep.playarea;

import com.prep.prep.oops.AbstractClassBike;
import com.prep.prep.oops.AbstractClassCar;
import com.prep.prep.oops.Abstraction;

public class AbstractionPlayArea {

    public static void main(String[] args) {
        Abstraction car = new AbstractClassCar("BMW", 220);
        Abstraction bike = new AbstractClassBike("Yamaha", 140);

        System.out.println(car.startEngine());
        System.out.println(car.displayInfo());

        System.out.println(bike.startEngine());
        System.out.println(bike.displayInfo());
    }
}
