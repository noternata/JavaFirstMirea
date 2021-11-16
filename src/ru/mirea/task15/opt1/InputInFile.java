package ru.mirea.task15.opt1;

import java.io.*;

public class InputInFile {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        OutputStream outputStream = new FileOutputStream("C:\\Users\\noternata\\Учеба\\3_семестр\\Программирование на java\\JavaFirstMirea\\src\\ru\\mirea\\task15\\File.txt");
        while (true)
        {
            String data = reader.readLine();
            if(data.equals("exit")){
                break;
            }
            else {
                outputStream.write((data +"\r\n").getBytes());
            }
        }
        outputStream.close();
        reader.close();
    }
}