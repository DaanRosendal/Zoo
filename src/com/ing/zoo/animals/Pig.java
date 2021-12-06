package com.ing.zoo.animals;

import com.ing.zoo.animals.types.Animal;
import com.ing.zoo.animals.types.Carnivore;
import com.ing.zoo.animals.types.Herbivore;
import com.ing.zoo.animals.types.Omnivore;

import java.util.Random;

public class Pig extends Omnivore {

    public Pig(String name, String helloText, String eatText) {
        super(name, helloText, eatText);
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
        System.out.println(name + ": " + trick);
    }
}
