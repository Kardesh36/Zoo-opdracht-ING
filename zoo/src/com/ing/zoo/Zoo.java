package com.ing.zoo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        List<Animal> animals = Arrays.asList(
                new Lion("henk"),
                new Hippo("elsa"),
                new Pig("dora"),
                new Tiger("wally"),
                new Zebra("marty"),
                new Giraffe("gina"),
                new Seal("sam")
        );

        Map<String, Animal> animalsByName = new HashMap<>();
        for (Animal animal : animals) {
            animalsByName.put(animal.getName().toLowerCase(), animal);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine().trim().toLowerCase();

        if (input.startsWith("hello")) {
            String[] parts = input.split("\\s+");
            if (parts.length == 1) {
                for (Animal animal : animals) {
                    animal.sayHello();
                }
            } else {
                Animal animal = animalsByName.get(parts[1]);
                if (animal != null) {
                    animal.sayHello();
                } else {
                    System.out.println("Unknown animal: " + parts[1]);
                }
            }
        } else if (input.equals("give leaves")) {
            for (Animal animal : animals) {
                if (animal instanceof Herbivore) {
                    ((Herbivore) animal).eatLeaves();
                }
            }
        } else if (input.equals("give meat")) {
            for (Animal animal : animals) {
                if (animal instanceof Carnivore) {
                    ((Carnivore) animal).eatMeat();
                }
            }
        } else if (input.equals("perform trick")) {
            for (Animal animal : animals) {
                if (animal instanceof TrickPerformer) {
                    ((TrickPerformer) animal).performTrick();
                }
            }
        } else {
            System.out.println("Unknown command: " + input);
        }
    }
}
