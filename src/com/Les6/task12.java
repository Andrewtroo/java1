package com.Les6;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        int min = 0;
        int max = 1000;

        for (int i = 500;; i = (min + max) / 2){
            System.out.println("Your number is " + i + "?" );
            System.out.println("1) yes\n2) <\n3) >");
            int answer = new Scanner(System.in).nextInt();
            switch (answer) {
                case 1 -> {
                    System.out.println("Hallelujah!");
                    return;
                }
                case 2 -> max = i;
                case 3 -> min = i;
            }
        }
    }
}