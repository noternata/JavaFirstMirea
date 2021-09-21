package ru.mirea.task1.opt7;

import java.util.Scanner;

public class Main {
    public static int factorial (int x){
        int p = 1;
        for(int i=1;i<=x;i++){
            p=p*i;
        }
        return p;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Введите число для расчета факториала");
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
        System.out.println("Факториал числа "+ a + " равен: "+ factorial(a));
    }
}
