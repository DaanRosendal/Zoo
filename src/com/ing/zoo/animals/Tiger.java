package com.ing.zoo.animals;

import java.util.Random;

public class Tiger extends Animal {
    public Tiger(String name, String helloText, String eatText, boolean isHerbivore, boolean isCarnivore) {
        super(name, helloText, eatText, isHerbivore, isCarnivore);
    }

    public void sayHello()
    {
        System.out.println(helloText);
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
            trick = "jumps in tree";
        }
        else
        {
            trick = "scratches ears";
        }
        System.out.println(trick);
    }
}
