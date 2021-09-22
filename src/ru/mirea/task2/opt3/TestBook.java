package ru.mirea.task2.opt3;

public class TestBook {
    public static void main(String[] args){
        Book b1 = new Book("One Hundred Years of Solitude", "Gabriel Garcia Marquez", 1595, true);
        Book b2 = new Book();
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
