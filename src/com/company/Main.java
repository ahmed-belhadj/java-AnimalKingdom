package com.company;

import java.util.ArrayList;

public class Main
{

    public static void printAnimals(ArrayList<AbstractAnimal> animals, CheckAnimal tester)
    {
        for (AbstractAnimal a : animals)
        {
            if (tester.test(a))
            {
                System.out.println(a.name);
            }
        }
    }

    public static void main(String[] args)
    {
        ArrayList<AbstractAnimal> AnimalList = new ArrayList<AbstractAnimal>();

        AnimalList.add(new Mammal("Panda", 1869));
        AnimalList.add(new Mammal("Zebra", 1778));
        AnimalList.add(new Mammal("Koala", 1816));
        AnimalList.add(new Mammal("Sloth", 1804));
        AnimalList.add(new Mammal("Armadillo", 1758));
        AnimalList.add(new Mammal("Raccoon", 1758));
        AnimalList.add(new Mammal("Bigfoot", 2021));

        AnimalList.add(new Bird("Pigeon", 1837));
        AnimalList.add(new Bird("Peacock", 1821));
        AnimalList.add(new Bird("Toucan", 1758));
        AnimalList.add(new Bird("Parrot", 1824));
        AnimalList.add(new Bird("Swan", 1758));

        AnimalList.add(new Fish("Salmon", 1758));
        AnimalList.add(new Fish("Catfish", 1817));
        AnimalList.add(new Fish("Perch", 1758));

        System.out.println("Animals in descending order by year named: ");
        AnimalList.sort((a1, a2) -> a1.yearDiscovered - a2.yearDiscovered);
        AnimalList.forEach((a) -> System.out.println(a.name));

        System.out.println("\nAnimals listed alphabetically: ");
        AnimalList.sort((a1, a2) -> a1.name.compareToIgnoreCase(a2.name));
        AnimalList.forEach((a) -> System.out.println(a.name));

        System.out.println("\nAnimals ordered by how they move: ");
        AnimalList.sort((a1, a2) -> a1.move().compareToIgnoreCase((a2.move())));
        AnimalList.forEach((a) -> System.out.println(a.name));

        System.out.println("\nAnimals that breathe with lungs: ");
        printAnimals(AnimalList, a -> a.breath().equals("lungs"));

        System.out.println("\nAnimals that breathe with lungs and were named in 1758: ");
        printAnimals(AnimalList, a -> a.breath().equals("lungs") && a.yearDiscovered == 1758);

        System.out.println("\nAnimals that lay eggs and breathe with lungs: ");
        printAnimals(AnimalList, a -> a.breath().equals("lungs") && a.reproduce().equals("eggs"));

        System.out.println("\nAnimals that were named in 1758 listed alphabetically: ");
        AnimalList.sort((a1, a2) -> a1.name.compareToIgnoreCase(a2.name));
        printAnimals(AnimalList, a -> a.yearDiscovered == 1758);
    }
}
