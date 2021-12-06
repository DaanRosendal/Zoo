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
        Pig dora = new Pig("dora", "splash", "munch munch oink", "nomnomnom oink thx");
        Tiger wally = new Tiger("wally", "rraaarww", "nomnomnom oink wubalubadubdub");
        Zebra marty = new Zebra("marty", "zebra zebra", "munch munch zank yee bra");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();
        if(input.equals(commands[0] + " henk"))
        {
            henk.sayHello();
        }
        else
        {
            System.out.println("Unknown command: " + input);
        }
    }
}
