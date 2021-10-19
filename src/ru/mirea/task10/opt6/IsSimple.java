package ru.mirea.task10.opt6;

import java.util.Scanner;

public class IsSimple {
    public static boolean checkPrime(int n) {
        return checkPrime1(n, 3);
    }

    public static boolean checkPrime1(int n, int currDivisor) {
        if (n < 2) {
            return false;
        }

        if (n % 2 == 0) {
            return (n == 2);
        }

        if (currDivisor * currDivisor > n) {
            return true;
        }

        if (n % currDivisor == 0) {
            return false;
        }

        return checkPrime1(n, currDivisor + 2);
    }
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println(checkPrime(x));
    }

}
