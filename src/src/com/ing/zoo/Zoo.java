package src.com.ing.zoo;

import src.com.ing.zoo.models.*;
import src.com.ing.zoo.models.abstracts.Animal;
import src.com.ing.zoo.models.interfaces.EatsLeaves;
import src.com.ing.zoo.models.interfaces.EatsMeat;
import src.com.ing.zoo.models.interfaces.Trickable;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        List<Animal> animals = new ArrayList<>();

        Lion henk = new Lion("henk");
        animals.add(henk);
        Hippo elsa = new Hippo( "elsa");
        animals.add(elsa);
        Pig dora = new Pig("dora");
        animals.add(dora);
        Tiger wally = new Tiger("wally");
        animals.add(wally);
        Zebra marty = new Zebra("marty");
        animals.add(marty);

        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.print("Voer uw command in: ");
            String input = scanner.nextLine();


            // say hello
            if (input.equals(commands[0])) {
                animals.forEach(Animal::sayHello);
            }
            // say hello with one name
            else if (input.split("hello*").length == 2) {
                String name = input.split("hello*")[1].trim();

                List<Animal> clone = new ArrayList<>(animals);
                clone.removeIf(animal -> !animal.name.equals(name));
                if (clone.isEmpty()) {
                    System.out.printf("%s is an invalid command%n", input);
                } else {
                    clone.forEach(Animal::sayHello);
                }
            } else if (input.equals(commands[1])) {
                animals.forEach(animal -> {
                    if (animal instanceof EatsLeaves) {
                        ((EatsLeaves) animal).eatLeaves();
                    }
                });
            } else if (input.equals(commands[2])) {
                animals.forEach(animal -> {
                    if (animal instanceof EatsMeat) {
                        ((EatsMeat) animal).eatMeat();
                    }
                });
            } else if (input.equals(commands[3])) {
                animals.forEach(animal -> {
                    if (animal instanceof Trickable) {
                        ((Trickable) animal).performTrick();
                    }
                });
            } else {
                System.out.println("Unknown command: " + input);
            }

        }
    }
}
