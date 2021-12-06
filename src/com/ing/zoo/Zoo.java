package com.ing.zoo;

import com.ing.zoo.animals.*;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args)
    {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        Lion henk = new Lion("henk", "roooaoaaaaar", "nomnomnom thx mate");
        Hippo elsa = new Hippo("elsa", "splash", "munch munch lovely");
        Pig dora = new Pig("dora", "splash", "munch munch oink");
        Tiger wally = new Tiger("wally", "rraaarww", "nomnomnom oink wubalubadubdub");
        Zebra marty = new Zebra("marty", "zebra zebra", "munch munch zank yee bra");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();
        if(input.equals(commands[0] + " henk")) henk.sayHello();
        else if(input.equals(commands[0] + " elsa")) elsa.sayHello();
        else if(input.equals(commands[0] + " dora")) dora.sayHello();
        else if(input.equals(commands[0] + " wally")) wally.sayHello();
        else if(input.equals(commands[0] + " marty")) marty.sayHello();
        else if(input.equals(commands[0])){
            henk.sayHello();
            elsa.sayHello();
            dora.sayHello();
            wally.sayHello();
            marty.sayHello();
        }
        else if(input.equals(commands[1])){
            elsa.eatLeaves();
            dora.eatLeaves();
            marty.eatLeaves();
        }
        else if(input.equals(commands[2])){
            henk.eatMeat();
            dora.eatMeat();
            wally.eatMeat();
        }
        else if(input.equals(commands[3])){
            dora.performTrick();
            wally.performTrick();
        }
        else
        {
            System.out.println("Unknown command: " + input);
        }
    }
}
