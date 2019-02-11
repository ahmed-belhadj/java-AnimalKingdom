package com.company;

public class Mammal extends AbstractAnimal implements Action
{
    String move;
    String breath;
    String reproduce;

    public Mammal(String name, int yearDiscovered)
    {
        super(name, yearDiscovered);
        this.move = "walk";
        this.breath = "lungs";
        this.reproduce = "live births";
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

    @Override
    public String toString()
    {
        return "Mammal{" +
                "move='" + move + '\'' +
                ", breath='" + breath + '\'' +
                ", reproduce='" + reproduce + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", yearDiscovered=" + yearDiscovered +
                '}';
    }
}
