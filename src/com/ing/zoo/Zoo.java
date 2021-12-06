package com.ing.zoo;

import com.ing.zoo.animals.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args)
    {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        Lion henk = new Lion("henk", "roooaoaaaaar", "nomnomnom thx mate", false, true);
        Hippo elsa = new Hippo("elsa", "splash", "munch munch lovely", true, false);
        Pig dora = new Pig("dora", "splash", "munch munch oink", "nomnomnom oink thx", true, true);
        Tiger wally = new Tiger("wally", "rraaarww", "nomnomnom oink wubalubadubdub", false, true);
        Zebra marty = new Zebra("marty", "zebra zebra", "munch munch zank yee bra", true, false);
        ArrayList<Animal> animals = new ArrayList<Animal>(Arrays.asList(henk, elsa, dora, wally, marty));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();
        if(input.equals(commands[0] + " henk")) henk.sayHello();
        else if(input.equals(commands[0] + " elsa")) elsa.sayHello();
        else if(input.equals(commands[0] + " dora")) dora.sayHello();
        else if(input.equals(commands[0] + " wally")) wally.sayHello();
        else if(input.equals(commands[0] + " marty")) marty.sayHello();
        else if(input.equals(commands[1])){
            for (Animal animal: animals) {
                animal.eatLeaves();
            }
        }
        else if(input.equals(commands[2])){
            for (Animal animal: animals) {
                animal.eatMeat();
            }
        }
        else
        {
            System.out.println("Unknown command: " + input);
        }
    }
}
