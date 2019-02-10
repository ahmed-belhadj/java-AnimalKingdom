package com.company;

public class Fish extends AbstractAnimal implements Action
{
    String move;
    String breath;
    String reproduce;

    public Fish(String name, int yearDiscovered)
    {
        super(name, yearDiscovered);
        this.move = "swim";
        this.breath = "gills";
        this.reproduce = "eggs";
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
        return "Fish{" +
                "move='" + move + '\'' +
                ", breath='" + breath + '\'' +
                ", reproduce='" + reproduce + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", yearDiscovered=" + yearDiscovered +
                '}';
    }
}
