package src.com.ing.zoo.models;

import src.com.ing.zoo.models.abstracts.Animal;
import src.com.ing.zoo.models.interfaces.EatsMeat;

public class Lion extends Animal implements EatsMeat {
    public String name;
    public String helloText;
    public String eatText;

    public Lion(String name) {
        super(name);
        this.helloText = super.helloText;
        this.eatText = super.eatText;
    }

    public void sayHello() {
        helloText = "roooaoaaaaar";
        System.out.println(helloText);
    }

    public void eatMeat() {
        eatText = "nomnomnom thx mate";
        System.out.println(eatText);
    }
}
