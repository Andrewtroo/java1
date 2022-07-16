package com.Les6;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        System.out.print("Number: ");
        double num = new Scanner(System.in).nextDouble();

        for (double i = num; i != 0; i--) {
            double x = num / i;

            if (x % 1 == 0 && x != num)
                    System.out.print((int)x + ", ");
                else if (x % 1 == 0 && x == num)
                    System.out.println((int)x + ".");
        }
    }
}