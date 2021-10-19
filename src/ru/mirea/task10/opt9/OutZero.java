package ru.mirea.task10.opt9;

import java.util.Scanner;

public class OutZero {
    public static int recursion(int a, int b) {
        // Базовый случай
        if (a > b + 1) {
            return 0;
        }
        // Базовый случай
        if (a == 0 || b == 0) {
            return 1;
        }
        // Шаг рекурсии / рекурсивное условие
        return recursion(a, b - 1) + recursion(a - 1, b - 1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите числa: ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(recursion(a, b)); // вызов рекурсивной функции
    }
}
