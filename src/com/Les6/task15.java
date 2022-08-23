package com.Les6;

import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {
        System.out.print("number: ");
        int a = new Scanner(System.in).nextInt();
        int b;
        String temp = "";
        while(a !=0){
            b = a % 2;
            temp = b + temp;
            a = a / 2;
        } System.out.print(temp);
    }
}

