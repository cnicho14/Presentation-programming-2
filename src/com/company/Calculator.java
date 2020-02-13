package com.company;

/**
 * Static polymorphism
 */
public class Calculator
{
    public int addNumbers(int a, int b)
    {
        return a + b;
    }

    public int addNumbers(int a, int b, int c)
    {
        return a + b + c;
    }

    public double addNumbers(double a, double b, double c)
    {
        return a + b + c;
    }
}
