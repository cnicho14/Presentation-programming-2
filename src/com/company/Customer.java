package com.company;

import java.util.List;

public class Customer
{
    private String name;
    private double bill;
    private int age;
    private List<Item> listOfItems;


    public Customer(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public double calculateBill(double tax)
    {
        for (Item item : listOfItems)
        {
            bill += item.getPrice();
        }
        bill += tax;
        this.setBill(bill);
        return bill;
    }

    public void fixMyCar()
    {
        System.out.println("Fixed your car");
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public double getBill()
    {
        return bill;
    }

    public void setBill(double bill)
    {
        this.bill = bill;
    }


    public List<Item> getListOfItems()
    {
        return listOfItems;
    }

    public void setListOfItems(List<Item> listOfItems)
    {
        this.listOfItems = listOfItems;
    }
}
