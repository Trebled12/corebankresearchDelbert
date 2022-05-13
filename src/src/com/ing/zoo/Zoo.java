package src.com.ing.zoo;

import src.com.ing.zoo.models.*;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        Lion henk = new Lion("henk");
//        henk.name = "henk";
        Hippo elsa = new Hippo( "elsa");
//        elsa.name = "elsa";
        Pig dora = new Pig("dora");
//        dora.name = "dora";
        Tiger wally = new Tiger("wally");
//        wally.name = "wally";
        Zebra marty = new Zebra("marty");
//        marty.name = "marty";


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
