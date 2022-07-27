package com.Les6;

public class task13 {
    public static void main(String[] args) {

        int happy = 0;
        for (int i = 1000; i <= 999999; i++){
            int num1 = i / 100000 % 10;
            int num2 = i / 10000 % 10;
            int num3 = i / 1000 % 10;
            int num4 = i / 100 % 10;
            int num5 = i / 10 % 10;
            int num6 = i  % 10;

            if (num1 + num2 + num3 == num4 + num5 + num6){
                happy ++;
                System.out.println(i);
            }
        }
        System.out.println("Total happy numbers: " + happy);
    }
}