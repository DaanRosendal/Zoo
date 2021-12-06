package com.ing.zoo.animals;

public class Animal{
    protected String name;
    protected String helloText;
    protected String eatText;
    protected String trick;
    protected boolean isHerbivore;
    protected boolean isCarnivore;

    public Animal(String name, String helloText, String eatText, boolean isHerbivore, boolean isCarnivore) {
        this.name = name;
        this.helloText = helloText;
        this.eatText = eatText;
        this.isHerbivore = isHerbivore;
        this.isCarnivore = isCarnivore;
    }

    public Animal(String name, String helloText, String eatText, String trick, boolean isHerbivore, boolean isCarnivore) {
        this.name = name;
        this.helloText = helloText;
        this.eatText = eatText;
        this.trick = trick;
        this.isHerbivore = isHerbivore;
        this.isCarnivore = isCarnivore;
    }

    public void sayHello(){
        System.out.println(this.name + ": " + this.helloText);
    }

    public void eatLeaves(){
        if(isHerbivore) System.out.println(this.name + ": " + this.eatText);
    }

    public void eatMeat(){
        if(isCarnivore) System.out.println(this.name + ": " + this.eatText);
    }
}
