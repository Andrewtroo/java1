package com.Les6;

import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        System.out.print("Number: ");
        int num = new Scanner(System.in).nextInt();

        if(num >= 0 && num < 10){
            System.out.println("one digit");
            return;
        }
        for(int i = num; i != 0; i /= 10){
            int x = i % 10;
            int y = i / 10 % 10;

            if(x < y){
                System.out.println("no non-decreasing order");
                return;
            }
        }
        System.out.println("non-decreasing order");
    }
}
