package com.ing.zoo.animals;

public abstract class Animal{
    protected String name;
    protected String helloText;
    protected String eatText;
    protected String trick;

    public Animal(String name, String helloText, String eatText) {
        this.name = name;
        this.helloText = helloText;
        this.eatText = eatText;
    }

    public Animal(String name, String helloText, String eatText, String trick) {
        this.name = name;
        this.helloText = helloText;
        this.eatText = eatText;
        this.trick = trick;
    }
}
