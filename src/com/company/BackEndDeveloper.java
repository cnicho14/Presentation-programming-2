package com.company;

public class BackEndDeveloper implements Developer
{
    public void writeJava()
    {
        System.out.println("Writing java");
    }

    @Override
    public void develop()
    {
        writeJava();
    }
}
