package com.ing.zoo.animals;

public class Lion extends Animal {
    public Lion(String name, String helloText, String eatText, boolean isHerbivore, boolean isCarnivore) {
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
}
