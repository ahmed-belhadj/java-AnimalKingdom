package com.company;

import java.util.UUID;

public class AbstractAnimal implements Action
{
    java.util.UUID id;
    String name;
    int yearDiscovered;
    String move;
    String breath;
    String reproduce;

    public AbstractAnimal(String name, int yearDiscovered)
    {
        this.id = UUID.randomUUID();
        this.name = name;
        this.yearDiscovered = yearDiscovered;
    }


    @Override
    public String move()
    {
        return this.move;
    }

    @Override
    public String breath()
    {
        return this.breath;
    }

    @Override
    public String reproduce()
    {
        return this.reproduce;
    }
}
