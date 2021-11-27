package com.company.lesson02;

public class Main {
    public static void main(String[] args) {
        User user = new User(30,"Alex", "pas");
        System.out.println(user.getName());
        user.setName("Vitya");
        System.out.println(user.getName());


        User user1 = new User(30,"Alex");
        System.out.println(user1.getName());
    }


}
