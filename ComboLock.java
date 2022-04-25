package com.company;

public class ComboLock {
    private int num1 = 7;
    private int num2 = 7;
    private int num3 = 7;
    private int position = 0;
    private int counter = 0;

    public ComboLock() {
    }

    public ComboLock(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public void setNewPass(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public void reset() {
        position = 1;
        counter = 0;
    }

    // x - how much do we turn
    public void turnLeft(int x) {
        if (x > position || x == 0) {
            position = 39 - (x - position);
        }
        if (x < position) {
            position -= x;
        }
        if (position == num2) {
            counter = 2;
        }
    }

    public void turnRight(int x) {
        if ((x + position) > 39) {
            position = (x + position) - 39;
        }

        if ((x + position) < 39) {
            position += x;
        }

        if (position == num1) {
            counter = 1;
        }

        if (position == num3 && counter == 2) {
            counter = 3;
        }
    }

    public void open() {
        if (counter == 3) {
            System.out.println("Open");
            reset();

        }
        if (counter < 3) {
            System.out.println("Locked. Try again.");
            reset();
        }
    }

}
