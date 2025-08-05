package com.prep.prep.oops;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract  class Vehicle {
    private String brand;
    private int speed;

    public String displayInfo() {
        return "brand: " + brand + ", speed: " + speed;
    }
}
