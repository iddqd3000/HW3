package com.company;

public class Battery {
    double capacity;
    double currentCharge;

    public Battery(double capacity) {
        this.capacity = capacity;
        this.currentCharge = capacity;
    }

    public void drain(double amount) {
        if (amount <= currentCharge) {
            currentCharge -= amount;
        } else {
            double z = amount - currentCharge;
            System.out.println("Not enough charge, not enough" + z + "mAh.");
        }
    }

    public void charge() {
        currentCharge = capacity;
    }

    public double getRemainingCapacity() {
        return currentCharge;
    }


}
