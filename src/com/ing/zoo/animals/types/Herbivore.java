package com.ing.zoo.animals.types;

public class Herbivore extends Animal {
    public Herbivore(String name, String helloText, String eatText) {
        super(name, helloText, eatText);
    }

    public void eatLeaves(){
        System.out.println(this.name + ": " + this.eatText);
    }
}
