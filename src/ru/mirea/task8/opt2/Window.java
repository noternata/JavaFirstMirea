package ru.mirea.task8.opt2;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    private JLabel pictureLabel;
    private Container controls;
    public Window(String s) {
        super("Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setResizable(false);
        this.setSize(1000, 620);
        //this.main(this);
        this.startWindow(s);
    }

    //public static void main(Window args){
        //Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        //int x = (int) ((dimension.getWidth() - args.getWidth()) / 2);
        //int y = (int) ((dimension.getHeight() - args.getHeight()) / 2);
        //args.setLocation(x, y);
    //}
    private void startWindow(String s) {
        controls = new Container();
        controls = getContentPane();
        controls.setLayout(new GridLayout());
        pictureLabel = new JLabel(new ImageIcon("C:\\Users\\noternata\\Учеба\\3_семестр\\Программирование на java\\JavaFirstMirea\\src\\ru\\mirea\\task8\\opt2\\Picture.jpg","test"));
        controls.add(pictureLabel);
    }

}
