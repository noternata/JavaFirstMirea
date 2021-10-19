package ru.mirea.task10.opt5;

import java.util.Scanner;

public class Summ {
    public static int sum(int x){
        if (x == 0)
            return 0;
        else
            return x%10+sum(x/10);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int x = in.nextInt();
        System.out.println("Сумма цифр в числе: "+ sum(x));
    }
}