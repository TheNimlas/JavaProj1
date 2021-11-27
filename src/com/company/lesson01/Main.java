package com.company.lesson01;

public class Main {

    public static void main(String[] args) {
        int a = 20, b = 1;
        double m;
        System.out.println(a + b);
        m = percent(a);
        System.out.println(m);
    }
    public static double percent(double num){
        num = num*1.1;
        return num;
    }

}