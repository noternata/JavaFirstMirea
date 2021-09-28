package ru.mirea.task3.opt3;

public class Book1 {
    private String name;
    private String author;
    private int pages;
    private int years;
    private boolean IsInLib;
    public Book1(String n, String a, int p, int y, boolean l) {
        this.name = n;
        this.author = a;
        this.pages = p;
        this.years =y;
        this.IsInLib=l;
    }
    public Book1(){}

    public void setName(String name){this.name = name;}
    public String getName(){return name;}
    public void changeName(String name){this.name = name;}
    public void setAuthor(String author){
        this.author = author;
    }
    public String getAuthor(){return author;}
    public void changeAuthor(String author){
        this.author = author;
    }
    public void setPages(int pages){
        this.pages = pages;
    }
    public int getPages(){
        return pages;
    }
    public void changePages(int pages){
        this.pages = pages;
    }
    public void setYear(int years){
        this.years = years;
    }
    public int getYear(){
        return years;
    }
    public void changeYear(int years){
        this.years = years;
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
