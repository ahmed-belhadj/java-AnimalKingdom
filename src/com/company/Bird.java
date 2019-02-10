package com.company;

public class Bird extends AbstractAnimal implements Action
{
    String move;
    String breath;
    String reproduce;

    public Bird(String name, int yearDiscovered)
    {
        super(name, yearDiscovered);
        this.move = "fly";
        this.breath = "lungs";
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
        return "Bird{" +
                "move='" + move + '\'' +
                ", breath='" + breath + '\'' +
                ", reproduce='" + reproduce + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", yearDiscovered=" + yearDiscovered +
                '}';
    }
}
