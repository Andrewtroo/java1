package com.Les6;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        System.out.print("Number: ");
        double num = new Scanner(System.in).nextDouble();

        if (num <= 1){
            return;
        }
        int i = 2;
        double x = num / i;
        while (i < num) {
            if (x % 1 == 0) {
                return;
            }
            i++;
        }
        System.out.println("prime number");
    }
}