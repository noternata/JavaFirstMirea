package ru.mirea.task15.opt2;


import java.io.*;

public class ShowFile {
    public static void main(String[] args) {
        try(FileInputStream fin=new FileInputStream("C:\\Users\\noternata\\Учеба\\3_семестр\\Программирование на java\\JavaFirstMirea\\src\\ru\\mirea\\task15\\File.txt"))
        {
            System.out.printf("File size: %d bytes \n", fin.available());
            int i=-1;
            while((i=fin.read())!=-1){
                System.out.print((char)i);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}