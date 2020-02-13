package com.company;

public class Ostrich extends Bird
{
    /**
     * Violation of the liskov principle occurs here
     * because an Ostrich can not fly
     */
    @Override
    public void fly()
    {
        super.fly();
    }
}
