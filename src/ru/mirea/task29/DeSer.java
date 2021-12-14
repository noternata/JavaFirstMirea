package ru.mirea.task29;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSer {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\noternata\\Учеба\\3_семестр\\Программирование на java\\JavaFirstMirea\\src\\ru\\mirea\\task29\\save_ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        SavedInf savedperson1  = (SavedInf) objectInputStream.readObject();
        SavedInf savedperson2  = (SavedInf) objectInputStream.readObject();

        System.out.println(savedperson1 );
        System.out.println("\n"+ savedperson2 );
    }
}
