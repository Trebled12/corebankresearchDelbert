package src.com.ing.zoo.models;

import src.com.ing.zoo.models.abstracts.Animal;
import src.com.ing.zoo.models.interfaces.EatsLeaves;

public class Hippo extends Animal implements EatsLeaves {
    public String name;
    public String helloText;
    public String eatText;

    public Hippo(String name) {
        super(name);
        this.helloText = super.helloText;
        this.eatText = super.eatText;
    }

    public void sayHello() {
        helloText = "splash";
        System.out.println(helloText);
    }

    public void eatLeaves() {
        eatText = "munch munch lovely";
        System.out.println(eatText);
    }
}
