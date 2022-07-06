package com.Les6;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        System.out.print("Number: ");
        int num = new Scanner(System.in).nextInt();

        int fact = 1;

        for (int i = 1; i <= num; i++)
            fact *= i;
        System.out.println("Factorial: " + fact);
    }
}
