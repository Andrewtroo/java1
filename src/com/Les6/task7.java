package com.Les6;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        System.out.print("Number: ");

        for (int i = new Scanner(System.in).nextInt(); i != 0; i /= 10) {
            int reversed = i % 10;
            System.out.print(reversed);
        }
    }
}
