package ru.mirea.task10.opt7;

import java.util.Scanner;

public class RazlMn {
    public static void recursion(int n, int k) {
        // k- дополнительный параметр. При вызове должен быть равен 2
        // Базовый случай
        if (k > n / 2) {
            System.out.println(n);
            return;
        }
        // Шаг рекурсии / рекурсивное условие
        if (n % k == 0) {
            System.out.print(k +" ");
            recursion(n / k, k);
        } // Шаг рекурсии / рекурсивное условие
        else {
            recursion(n, ++k);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int x = in.nextInt();
        System.out.print("Множители числа: ");
        recursion(x, 2); // вызов рекурсивной функции
    }
}
