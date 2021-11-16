package ru.mirea.task15.opt3;

import java.io.*;
public class ChangeFile {
    public static void replaceSelected(String target, String replaceWith) {
        try {
            BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\noternata\\Учеба\\3_семестр\\Программирование на java\\JavaFirstMirea\\src\\ru\\mirea\\task15\\File.txt"));
            String line;
            StringBuffer inputBuffer = new StringBuffer();

            while ((line = file.readLine()) != null) {
                inputBuffer.append(line);
                inputBuffer.append('\n');
            }
            String inputStr = inputBuffer.toString();
            file.close();
            inputStr = inputStr.replace(target, replaceWith);
            FileOutputStream fileOut = new FileOutputStream("C:\\Users\\noternata\\Учеба\\3_семестр\\Программирование на java\\JavaFirstMirea\\src\\ru\\mirea\\task15\\File.txt");
            fileOut.write(inputStr.getBytes());
            fileOut.close();
        } catch (Exception e) {
            System.out.println("Problem reading file.");
        }
    }
    public static void main(String[] args) {
        replaceSelected("aaa","bbbbbbbb");
    }
}