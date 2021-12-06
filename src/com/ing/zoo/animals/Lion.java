package com.ing.zoo.animals;

public class Lion extends Animal {
    public Lion(String name, String helloText, String eatText) {
        super(name, helloText, eatText);
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
