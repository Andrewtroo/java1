package com.Les6;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        System.out.print("Number: ");
        int num = new Scanner(System.in).nextInt();

        int summ = 0;
        int length = 0;
        int i = num;
        while (i != 0){
            summ += (i % 10);
            length++;
            i /= 10;
        }
        System.out.println(summ);
        System.out.println(length);
    }
}