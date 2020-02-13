package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main
{

    public static void main(String[] args)
    {
        Animal dog = new Dog(); // Why can I do this?
        dog.talk();
        Animal cat = new Cat();
        Cat cat2 = new Cat();
        makeItTalk(cat);
        cat2.talk();
        makeItTalk(dog);
       // Car mycar = new Car();


        Calculator calc = new Calculator();
        System.out.println(calc.addNumbers(12, 24));
        System.out.println(calc.addNumbers(12, 24, 32));
        System.out.println(calc.addNumbers(3.0, 4.0, 4.0));

        Shape triangle = new Triangle();
        Shape circle = new Circle();
        Shape square = new Square();
        List<Shape> shapes = new ArrayList<> ();
        shapes.add(triangle);
        shapes.add(square);
        shapes.add(circle);

        drawShapes(shapes);



    }

    static void makeItTalk(Animal animal)
    {
        /**
         * at compile time the complier doesnt know exactly which class of object will be passed
         * to makeAnimalTalk at runtime. It only knows that the object will be some derived class
         * of Animal.
         * Dynamic binding will decide at runtime which method to invoke based on the class of the object
         */
        animal.talk(); //What is happening here? how does java infer the object type here?
    }

    /**
     * Where is the polymorphism happening here?
     *
     * @param shapes
     */
    static void drawShapes(List<Shape> shapes)
    {
        /**
         * in the case you need to make the application draw a new shape you do not need to modify
         * the code in the drawShapes method rather you just create a new class for example Square
         * and have the class implement the Shape interface this makes the code open for extension but
         * closed for modification
         */
        for (var shape: shapes)
        {
            shape.draw();
        }
    }
}
