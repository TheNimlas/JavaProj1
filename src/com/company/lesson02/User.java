package com.company.lesson02;

public class User {
    private int age;
    private String name;
    private String passportData;

    public User(int age, String name){
        this.age = age;
        this.name = name;

    }
    public User(int age, String name, String passportData){
        this.age = age;
        this.name = name;
        this.passportData = passportData;

    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public String getPassport(){
        return passportData;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
