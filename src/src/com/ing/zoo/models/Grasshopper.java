package src.com.ing.zoo.models;

import src.com.ing.zoo.models.abstracts.Animal;
import src.com.ing.zoo.models.interfaces.EatsLeaves;

public class Grasshopper extends Animal implements EatsLeaves {

    public Grasshopper(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        helloText = "hop hop";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves() {
        eatText = "crop crop";
        System.out.println(eatText);
    }
}
