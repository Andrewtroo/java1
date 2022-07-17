package com.Les6;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        System.out.print("Number: ");

        for(int i = new Scanner(System.in).nextInt(); i != 0; i /= 10){
            int x = i % 10;
            int y = i / 10 % 10;
            if(x == y){
                System.out.println("same numbers in a row");
                return;
            }
        }
        System.out.println("no same numbers in a row");
    }
}
