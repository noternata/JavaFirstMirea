package ru.mirea.task10.opt8;

import java.util.Scanner;

public class Palindrom {
    public static String recursion(String s) {
        // Базовый случай
        if (s.length() == 1) {
            return "YES";
        } else {
            if (s.substring(0, 1).equals(s.substring(s.length() - 1, s.length()))) {
                // Базовый случай
                if (s.length() == 2) {
                    return "YES";
                }
                // Шаг рекурсии / рекурсивное условие
                return recursion(s.substring(1, s.length() - 1));
            } else {
                return "NO";
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String x = in.nextLine();
        System.out.println(recursion(x)); // вызов рекурсивной функции
        // radar

    }
}
