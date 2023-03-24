package ru.ibs.program8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Введите целое положительное число n:");
        int n = input.nextInt();
        int[] array = new int[n];

        int sum = 0;
        for (int i=0; i<n; i++) {
            array[i] = i+1;
            if ((array[i] % 2) != 0 || array[i] == 1) {
                sum = sum + array[i];
            }
        }
        System.out.println("Сумма: "+sum);
    }
}
