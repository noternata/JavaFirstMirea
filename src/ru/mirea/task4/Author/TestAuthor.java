package ru.mirea.task4.Author;

public class TestAuthor {
    public static void main(String[] args){
        Author a1 = new Author("Oleg Ivanov", "oivanov@gmail.com", 'M');
        Author a2 = new Author("Elena Smirnova", "e_smirnova@gmail.com", 'W');
        System.out.println(a1.toString());
        a1.setEmail("oleg_ivanov6@gmail.com");
        System.out.println(a1.toString());
        System.out.println(a2.toString());
    }
}
