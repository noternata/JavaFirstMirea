package ru.mirea.task2.opt3;

public class Book {
    private String name;
    private String author;
    private int pages;
    private boolean IsInLib;
    public Book(String n, String a, int p, boolean l) {
        this.name = n;
        this.author = a;
        this.pages = p;
        this.IsInLib=l;
    }
    public Book(){}
    public void setName(String name){
        this.name = name;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setPages(int pages){
        this.pages = pages;
    }
    public void setIsInLib(boolean IsInLib){
        this.IsInLib = IsInLib;
    }
    public void getIsInLib(){
        if (this.IsInLib) System.out.println("Book is in library");
        else System.out.println("Book is not in library");
    }
    public String toString(){
        return "Name of book: "+this.name+ ", Author of book: " +this.author+", pages in book: " +this.pages;
    }
}
