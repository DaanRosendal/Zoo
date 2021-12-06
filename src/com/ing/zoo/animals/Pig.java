package com.ing.zoo.animals;

import java.util.Random;

public class Pig extends Animal{

    public Pig(String name, String helloText, String eatText, String trick, boolean isHerbivore, boolean isCarnivore) {
        super(name, helloText, eatText, trick, isHerbivore, isCarnivore);
    }

    public void sayHello()
    {
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        System.out.println(eatText);
    }

    public void eatMeat()
    {
        System.out.println(eatText);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "rolls in the mud";
        }
        else
        {
            trick = "runs in circles";
        }
        System.out.println(trick);
    }
}
