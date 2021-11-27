package com.company.homework;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args){
        int []number = new int[5];
        String[] words = new String[]{"Privet", "Poka", "kyky", "Molodec", "Kakashka"};
        for(int i = 0; i < 5; i++){
            number[i] = words[i].length();
            System.out.println(number[i]);
        }
    }
}
