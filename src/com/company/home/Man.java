package com.company.home;

public class Man {
    private int age;
    private String name;
    private String wife;

    public Man(int age, String name, String wife){
        this.age = age;
        this.name = name;
        this.wife = wife;
    }

    public String getName(){
        return this.name;
    }
}
