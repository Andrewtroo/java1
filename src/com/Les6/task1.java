package com.Les6;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.print("Number of stars: ");
        int star = new Scanner(System.in).nextInt();
        int i = 1;
        while (i <= star){
            System.out.print("*");
            i ++;
        }
    }
}
