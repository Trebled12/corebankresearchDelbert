package src.com.ing.zoo.models;

import src.com.ing.zoo.models.abstracts.Animal;
import src.com.ing.zoo.models.interfaces.EatsLeaves;
import src.com.ing.zoo.models.interfaces.EatsMeat;

public class Pigeon extends Animal implements EatsMeat, EatsLeaves {
    public Pigeon(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        helloText = "roekoe roekoe";
        System.out.println(helloText);
    }

    @Override
    public void eatMeat() {
        eatText = "hap hap meat";
        System.out.println(eatText);
    }

    @Override
    public void eatLeaves() {
        eatText = "hap hap leaf";
        System.out.println(eatText);
    }
}
