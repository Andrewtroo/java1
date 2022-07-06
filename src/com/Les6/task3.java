package com.Les6;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        System.out.print("First number: ");
        int M = new Scanner(System.in).nextInt();
        System.out.print("Second number: ");
        int N = new Scanner(System.in).nextInt();

        int summ = 0;

        for (int i = M; i <= N; i++)
            summ += i;
        System.out.println(summ);
    }
}
