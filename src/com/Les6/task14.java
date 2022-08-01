package com.Les6;

public class task14 {
    public static void main(String[] args) {

        int num1, num2, num3, num4, num5, num6, num7, num8;
        int total = 0;
        for (int i = 10000000; i <= 99999999; i++) {
            if (i % 12345 == 0) {
                    num1 = i / 10000000 % 10;
                    num2 = i / 1000000 % 10;
                    num3 = i / 100000 % 10;
                    num4 = i / 10000 % 10;
                    num5 = i / 1000 % 10;
                    num6 = i / 100 % 10;
                    num7 = i / 10 % 10;
                    num8 = i % 10;
                    if (num1 != num2 && num1 != num3 && num1 != num4 && num1 != num5 && num1 != num6 && num1 != num7 &&
                            num1 != num8 && num2 != num3 && num2 != num4 && num2 != num5 && num2 != num6 && num2 != num7 &&
                            num2 != num8 && num3 != num4 && num3 != num5 && num3 != num6 && num3 != num7 && num3 != num8 &&
                            num4 != num5 && num4 != num6 && num4 != num7 && num4 != num8 && num5 != num6 && num5 != num7 &&
                            num5 != num8 && num6 != num7 && num6 != num8 && num7 != num8) {
                        total++;
                    System.out.println(i);
                    }
                }
            }
        System.out.println("Total: " + total);
    }
}