package ru.mirea.task8.opt2;

public class TestWindow2 {
    public static void main(String[] args) {
        String s = "";
        for (int i = 0;i < args.length;i++){
            s = s + args[i];
        }
        Window w = new Window(s);
        w.setVisible(true);
    }
}
