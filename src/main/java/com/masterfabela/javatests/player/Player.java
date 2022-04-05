package com.masterfabela.javatests.player;

class Player {

    private final Dice dice;
    private final int minNumberToWin;

    Player(Dice dice, int minNumberToWin) {
        this.dice = dice;
        this.minNumberToWin = minNumberToWin;
    }

    boolean play(){
        int diceNumber = dice.roll();
        return diceNumber >= minNumberToWin;
    }
}
