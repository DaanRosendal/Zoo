package com.ing.zoo.animals;

import com.ing.zoo.animals.types.Carnivore;
import java.util.Random;

public class Tiger extends Carnivore {
    public Tiger(String name, String helloText, String eatText) {
        super(name, helloText, eatText);
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
        System.out.println(name + ": " + trick);
    }
}
