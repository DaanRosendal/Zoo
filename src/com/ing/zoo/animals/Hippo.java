package com.ing.zoo.animals;

public class Hippo extends Animal {
    public Hippo(String name, String helloText, String eatText) {
        super(name, helloText, eatText);
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
