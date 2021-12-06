package com.ing.zoo.animals.types;

public class Omnivore extends Animal {
    public Omnivore(String name, String helloText, String eatText) {
        super(name, helloText, eatText);
    }

    public void eatMeat(){
        System.out.println(this.name + ": " + this.eatText);
    }

    public void eatLeaves(){
        System.out.println(this.name + ": " + this.eatText);
    }
}
