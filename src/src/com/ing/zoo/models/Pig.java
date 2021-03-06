package src.com.ing.zoo.models;

import src.com.ing.zoo.models.abstracts.Animal;
import src.com.ing.zoo.models.interfaces.EatsLeaves;
import src.com.ing.zoo.models.interfaces.EatsMeat;
import src.com.ing.zoo.models.interfaces.Trickable;

import java.util.Random;

public class Pig extends Animal implements Trickable, EatsMeat, EatsLeaves {
    public String trick;

    public Pig(String name) {
        super(name);
    }

    public void sayHello()
    {
        helloText = "splash";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch oink";
        System.out.println(eatText);
    }

    public void eatMeat()
    {
        eatText = "nomnomnom oink thx";
        System.out.println(eatText);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "rolls in the mud";
        }
        else
        {
            trick = "runs in circles";
        }
        System.out.println(trick);
    }
}
