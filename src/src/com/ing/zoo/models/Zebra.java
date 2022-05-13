package src.com.ing.zoo.models;

import src.com.ing.zoo.models.abstracts.Animal;
import src.com.ing.zoo.models.interfaces.EatsLeaves;

public class Zebra extends Animal implements EatsLeaves {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Zebra(String name) {
        super(name);
        this.helloText = super.helloText;
        this.eatText = super.eatText;
    }

    public void sayHello() {
        helloText = "zebra zebra";
        System.out.println(helloText);
    }

    public void eatLeaves() {
        eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }
}
