package ru.mirea.task1.opt3;

import java.util.Scanner;

public class massives {
    public static int sum_for (int mas[] ){
        int n = mas.length;
        int s = 0;
        for(int i = 0; i<n; i++){
            s=s+mas[i];
        }
        return s;
    }
    public static int sum_while (int mas[]){
        int n = mas.length;
        int s = 0;
        int i=0;
        while(i!=n){
            s=s+mas[i];
            i++;
        }
        return s;
    }
    public static int sum_do_while (int mas[]){
        int n = mas.length;
        int s = 0;
        int i=0;
        do{
            s=s+mas[i];
            i++;
        }while (i!=n);
        return s;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Введите количество элементов массива");
        int a;
        while (true){
            a= sc.nextInt();
            if(a < 1) {
                System.out.println("Вы ввели неверно число, введите число еще раз");
            }
            else{
                break;
            }
        }
        System.out.println("Введите массив");
        int[] mass = new int[a];
        for(int i=0;i<a;i++){
            mass[i]= sc.nextInt();
        }
        System.out.println("Сумма методом for: "+ sum_for(mass));
        System.out.println("Сумма методом while: "+ sum_while(mass));
        System.out.println("Сумма методом do while: "+ sum_do_while(mass));
    }
}
