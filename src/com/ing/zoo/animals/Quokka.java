package com.ing.zoo.animals;

import com.ing.zoo.animals.types.Herbivore;

import java.util.Random;

public class Quokka extends Herbivore {
    public Quokka(String name, String helloText, String eatText) {
        super(name, helloText, eatText);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "be cute";
        }
        else
        {
            trick = "be cuter";
        }
        System.out.println(name + ": " + trick);
    }
}
