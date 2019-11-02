package com.masterfabela.javatests.player;

class Player {

    private Dice dice;
    private int minNumberToWin;

    Player(Dice dice, int minNumberToWin) {
        this.dice = dice;
        this.minNumberToWin = minNumberToWin;
    }

    boolean play(){
        int diceNumber = dice.roll();
        return diceNumber > minNumberToWin;
    }
}
