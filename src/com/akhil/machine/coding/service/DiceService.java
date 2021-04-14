package com.akhil.machine.coding.service;

import java.util.Random;

public class DiceService {
    private static Random random = new Random();
    public static int roll(){
        return random.nextInt(7);
    }
}
