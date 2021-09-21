package ru.mirea.task1.opt5;

public class Hrow {
    public static void main(String[] args)  {
        System.out.println("Первые 10 чисел гармонического ряда:");
        for (double n = 1; n <= 10; n++){
            System.out.format("%.7f",1/n );
            System.out.print(" ");
        }
    }
}
