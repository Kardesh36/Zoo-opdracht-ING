package com.ing.zoo;

import java.util.Random;

public class Seal extends Animal implements Carnivore, TrickPerformer {
    private String helloText;
    private String eatText;
    private String trick;

    public Seal(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        helloText = "arf arf";
        System.out.println(helloText);
    }

    @Override
    public void eatMeat() {
        eatText = "chomp chomp fresh fish";
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            trick = "balances a ball";
        } else {
            trick = "claps its flippers";
        }
        System.out.println(trick);
    }
}
