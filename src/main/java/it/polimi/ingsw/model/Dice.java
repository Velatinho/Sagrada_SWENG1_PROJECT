package it.polimi.ingsw.model;

import java.util.Random;

public class Dice {

    private Colors color;
    private int value;
    private final int faces = 6;

    public Dice(Colors color){
        this.color = color;
    }

    public Colors getColor() {
        return color;
    }

    public int getValue() {
        return value;
    }

    public void setValue() {
        Random r = new Random();
        this.value = r.nextInt(6) + 1;
    }
}
