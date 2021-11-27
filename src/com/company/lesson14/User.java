package com.company.lesson14;

public class User {
    private String name;
    private int age;

    public User(String name, int age)
    {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "my name is " + name + "me" + age;
    }
}
