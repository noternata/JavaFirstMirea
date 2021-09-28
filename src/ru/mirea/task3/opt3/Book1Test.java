package ru.mirea.task3.opt3;

import ru.mirea.task3.opt3.Book1;

public class Book1Test {
    public static void main(String[] args){
        Book1 b1 = new Book1("One Hundred Years of Solitude", "Gabriel Garcia Marquez", 1595,1997, true);
        Book1 b2 = new Book1();
        b2.setAuthor("Leo Tolstoy");
        b2.setName("War and Peace");
        b2.setPages(6700);
        b2.setIsInLib(false);
        System.out.println(b1);
        b1.getIsInLib();
        System.out.println(b2);
        b2.getIsInLib();
    }
}
