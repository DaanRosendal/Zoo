package com.ing.zoo.animals.types;

public class Carnivore extends Animal {
    public Carnivore(String name, String helloText, String eatText) {
        super(name, helloText, eatText);
    }

    public void eatMeat(){
        System.out.println(this.name + ": " + this.eatText);
    }
}
