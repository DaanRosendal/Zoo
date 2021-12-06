package com.ing.zoo.animals.types;

public class Animal {
    protected String name;
    protected String helloText;
    protected String eatText;
    protected String trick;

    public Animal(String name, String helloText, String eatText) {
        this.name = name;
        this.helloText = helloText;
        this.eatText = eatText;
    }

    public void sayHello(){
        System.out.println(this.name + ": " + this.helloText);
    }
}
