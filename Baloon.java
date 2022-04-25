package com.company;

public class Baloon {
    private double radius;

    public Baloon() {
    }

    public void inflate(double amount) {
        radius += amount;
    }

    public double getVolume() {
        double volume = 4 / 3 * Math.PI * radius * radius * radius;
        return volume;
    }
}
