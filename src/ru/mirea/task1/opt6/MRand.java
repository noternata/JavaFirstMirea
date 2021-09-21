package ru.mirea.task1.opt6;
import java.lang.*;
import java.util.Random;
import java.util.Scanner;

public class MRand {
    public static void insertSort(int[] mass) {
        for (int i = 1; i < mass.length; i++) {
            int cur = mass[i];
            int j = i - 1;
            while(j >= 0 && cur < mass[j]) {
                mass[j+1] = mass[j];
                j--;
            }
            mass[j+1] = cur;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество чисел в массиве: ");
        int n = sc.nextInt();
        int[] mas = new int[n];
        System.out.print("Массив случайных чисел: ");
        for(int i = 0; i<n; i++){
            mas[i] = (int) Math.round(Math.random() * 100);
            System.out.print(mas[i] + " ");
        }
        System.out.println("");
        System.out.print("Отсортированный массив случайных чисел: ");
        insertSort(mas);
        for(int i = 0; i<n; i++){
            System.out.print(mas[i] + " ");
        }
        System.out.println("");
        //Создадим массив с использованием класса Random
        System.out.print("Массив случайных чисел, cозданный с использованием класса Random: ");
        Random rand = new Random();
        int min = 10 , max = 99;
        for (int i = 0; i< n; i++) {
            mas[i] = rand.nextInt((max - min)+1)+min;
            System.out.print(mas[i] + " ");
        }
        System.out.println("");
        System.out.print("Отсортированный массив случайных чисел: ");
        insertSort(mas);
        for(int i = 0; i<n; i++){
            System.out.print(mas[i] + " ");
        }
    }
}
