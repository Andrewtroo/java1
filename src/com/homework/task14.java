package com.homework;

import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("���������� �����(��.): ");
        int chicken = scanner.nextInt();
        System.out.print("��������� ����� ������(���.): ");
        double oneChickenPrice = scanner.nextDouble();
        System.out.print("������ ��� � ������(��.): ");
        double eggWeek = scanner.nextDouble();
        System.out.print("���� �� ������� ���(���.): ");
        double tenEggsPrice = scanner.nextDouble();

        double cost = chicken * oneChickenPrice;
        double profitDay = eggWeek / 7 * tenEggsPrice / 10 * chicken ;
        double profitDay_nds = profitDay - (profitDay * 0.1);
        double payback = cost / profitDay_nds;

        if (chicken < 1 || oneChickenPrice < 0 || eggWeek < 0 || tenEggsPrice < 0){
            System.out.println("�������� ����");
            return;
        }
        if (payback < 1)
            System.out.println("�������� ����� ��");
        else if (payback % 1 > 0)
            System.out.println("�����������: " + ((int) (payback) + 1) + " ����");
        else System.out.println("�����������: " + payback + " ����");
    }
}