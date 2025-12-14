package com.ing.zoo;

public class Giraffe extends Animal implements Herbivore {
    private String helloText;
    private String eatText;

    public Giraffe(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        helloText = "hummmmm";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves() {
        eatText = "munch munch from the treetop";
        System.out.println(eatText);
    }
}
