package com.company.home;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework {
    public static void main(String[] args) throws IOException {
        Man man1 = new Man(30, "Dima", "Mari");
        Woman woman1 = new Woman(27, "Mari", "Dima");

        if (woman1.getHusband() == man1.getName())
        {
            System.out.println("YES");
        }
    }
}
