package ru.mirea.task10.opt10;

import java.util.Scanner;

public class ReverseX {
    public static int recursion(int n, int i) {
        return (n==0) ? i : recursion( n/10, i*10 + n%10 );
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int x = in.nextInt();
        System.out.print("Развернутое число: ");
        System.out.println(recursion(x, 0));

    }
}
