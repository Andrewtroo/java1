package com.homework;

import java.util.Scanner;

public class task12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your question: ");
        scanner.nextLine();
        int number = (int) (Math.random() * 20);
        switch (number) {
            case 0 -> System.out.println("Yes");
            case 1 -> System.out.println("Definitely yes");
            case 2 -> System.out.println("Be sure");
            case 3 -> System.out.println("No doubt");
            case 4 -> System.out.println("Certainly");
            case 5 -> System.out.println("No");
            case 6 -> System.out.println("Definitely not");
            case 7 -> System.out.println("Absolutely not");
            case 8 -> System.out.println("No way");
            case 9 -> System.out.println("None");
            case 10 -> System.out.println("Possibly");
            case 11 -> System.out.println("Perhaps");
            case 12 -> System.out.println("Maybe");
            case 13 -> System.out.println("Most likely yes");
            case 14 -> System.out.println("Most likely not");
            case 15 -> System.out.println("Probably not");
            case 16 -> System.out.println("Probably yes");
            case 17 -> System.out.println("Might be");
            case 18 -> System.out.println("Likely");
            case 19 -> System.out.println("Apparently yes");
        }
    }
}