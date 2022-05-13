package src.com.ing.zoo.models.abstracts;

public abstract class Animal {
    public String name;
    public String helloText;
    public String eatText;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void sayHello();
}
