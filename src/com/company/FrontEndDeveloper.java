package com.company;

public class FrontEndDeveloper implements Developer
{
    public void writeJavaScript()
    {
        System.out.println("Writing javascript");
    }

    @Override
    public void develop()
    {
        writeJavaScript();
    }
}
