package com.company;

public class Sheet {
    private String name = "A0";
    private int width = 841;
    private int height = 1189;
    private int counter = 0;

    public Sheet() {
    }

    public void cutInHalf() {
        if (counter < 4) {


            if (height > width) {
                height /= 2;
                counter += 1;
                name = "A" + Integer.toString(counter);
            } else {
                width /= 2;
                counter += 1;
                name = "A" + Integer.toString(counter);
            }

        } else {
            System.out.println("Сan no longer be cut.");
        }


    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

}

