package com.company;

import java.util.Objects;

public class Main
{

    public static void main(String[] args)
    {
        Animal dog = new Dog(); // Why can I do this?
        dog.talk();
        Animal cat = new Cat();
        Cat cat2 = new Cat();
        makeAnimalTalk(cat);
        cat2.talk();
        makeAnimalTalk(dog);

        Calculator calc = new Calculator();
        System.out.println(calc.addNumbers(12, 24));
        System.out.println(calc.addNumbers(12, 24, 32));

    }

    static void makeAnimalTalk(Animal animal)
    {
        animal.talk(); //What is happening here? how does java infer the object type here?
    }
}
