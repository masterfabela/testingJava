package com.masterfabela.javatests.player;

import java.util.Random;

public class Dice {

    private int sides;

    public Dice(int sides){
        this.sides = sides;
    }

    int roll(){
        return new Random().nextInt(sides+1);
    }
}
