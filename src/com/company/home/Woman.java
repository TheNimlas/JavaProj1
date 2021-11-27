package com.company.home;

public class Woman {
    private int age;
    private String name;
    private String husband;

    public Woman(int age, String name, String husband){
        this.age = age;
        this.name = name;
        this.husband = husband;
    }

    public int getAge(){
        return this.age;
    }

    public String getHusband(){
        return this.husband;
    }
}
