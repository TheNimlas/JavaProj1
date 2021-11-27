package com.company.homework;

public class Human {
    private String name;
    private int age;
    private Human father;
    private Human mother;

    public Human(String name, int age)
    {
        this.age = age;
        this.name = name;
    }

    public Human(String name, int age, Human father, Human mother)
    {
        this.age = age;
        this.name = name;
        this.father = father;
        this.mother = mother;
    }

    @Override
    public String toString()
    {
        return "Имя: " + name + " Возраст: " + age + father + mother;
    }

}
