package com.Les6;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        System.out.print("From: ");
        int CelsiusFrom = new Scanner(System.in).nextInt();
        System.out.print("To: ");
        int CelsiusTo = new Scanner(System.in).nextInt();

        System.out.println("Celsius / Fahrenheit");
        for (int i = CelsiusFrom; i <= CelsiusTo; i++) {
            double fahrenheit = ((double) i * 9 / 5) + 32;
            System.out.println(i + " / " + fahrenheit);
        }
    }
}
