package com.company.lesson13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n = reader.readLine();
        int a = Integer.parseInt(n);
        int[][] arr = new int[a][a];
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                arr[i][j] = i*j;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
