package src.com.ing.zoo.models.abstracts;

public abstract class Animal {
    private String name;
    private String helloText;
    private String eatText;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void sayHello();
}
