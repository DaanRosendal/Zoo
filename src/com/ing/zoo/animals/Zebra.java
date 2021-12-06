package com.ing.zoo.animals;

import java.util.Random;

public class Zebra extends Animal {
    public Zebra(String name, String helloText, String eatText, boolean isHerbivore, boolean isCarnivore) {
        super(name, helloText, eatText, isHerbivore, isCarnivore);
    }

    public void sayHello()
    {
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        System.out.println(eatText);
    }
}
