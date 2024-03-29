package com.masterfabela.javatests.player;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PlayerTest {

    private Dice dice;

    @Before
    public void setup(){
        dice = Mockito.mock(Dice.class);
    }

    @Test
    public void looses_when_dice_number_is_too_low(){
        Mockito.when(dice.roll()).thenReturn(2);
        Player player = new Player(dice, 3);
        assertFalse(player.play());
    }

    @Test
    public void wins_when_dice_number_is_same(){
        Mockito.when(dice.roll()).thenReturn(2);
        Player player = new Player(dice, 2);
        assertTrue(player.play());
    }

    @Test
    public void wins_when_dice_number_big(){
        Mockito.when(dice.roll()).thenReturn(4);
        Player player = new Player(dice, 3);
        assertTrue(player.play());
    }
}