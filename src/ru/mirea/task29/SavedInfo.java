package ru.mirea.task29;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

class SavedInf implements Serializable {

    private static final long serialVersionUID = 1L;

    private String[] FIOInfo;
    private String[] vacInfo;
    private String[] historyInfo;

    public SavedInf(String[] FIOInfo, String[] vacInfo, String[] historyInfo){
        this.FIOInfo = FIOInfo;
        this.vacInfo = vacInfo;
        this.historyInfo = historyInfo;
    }

    public String[] getFIOInfo() {
        return FIOInfo;
    }

    public void setFIOInfo(String[] FIOInfo) {
        this.FIOInfo = FIOInfo;
    }

    public String[] getvacInfo() {
        return vacInfo;
    }

    public void setvacInfo(String[] vacInfo) {
        this.vacInfo = vacInfo;
    }

    public String[] gethistoryInfo() {
        return historyInfo;
    }

    public void sethistoryInfo(String[] historyInfo) {
        this.historyInfo = historyInfo;
    }

    @Override
    public String toString() {
        return "SavedInfo{" +
                "FIOInfo=" + Arrays.toString(FIOInfo) +
                ",\nvacInfo" + Arrays.toString(vacInfo) +
                ",\nhistoryInfo" + Arrays.toString(historyInfo) +
                '}';
    }
}

public class SavedInfo {
    public static void main(String[] args) throws IOException {

        //создаем наш объект
        String[] FIOInfo1 = {"Мельников Глеб Олегович"};
        String[] vacInfo1 = {"Прививка от туберкулеза", "Прививка от Гриппа "};
        String[] historyInfo1= {"Переболел ангиной с 30.11.2016- 14.12.2016, Обратился с отравлением 20.09.2020"};
        String[] FIOInfo2 = {"Романова Ольга Евгеньевна"};
        String[] vacInfo2 = {"Прививка от столбняка", "Прививка от covid19"};
        String[] historyInfo2= {"Переболела гриппом с 28.10.2020- 14.11.2020, Обратилась с переломом руки 02.12.2021"};

        SavedInf savedperson1 = new SavedInf(FIOInfo1, vacInfo1, historyInfo1);
        SavedInf savedperson2 = new SavedInf(FIOInfo2, vacInfo2, historyInfo2);

        //создаем 2 потока для сериализации объекта и сохранения его в файл
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\noternata\\Учеба\\3_семестр\\Программирование на java\\JavaFirstMirea\\src\\ru\\mirea\\task29\\save_ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        // сохраняем игру в файл
        objectOutputStream.writeObject(savedperson1 );
        objectOutputStream.writeObject(savedperson2 );

        //закрываем поток и освобождаем ресурсы
        objectOutputStream.close();
    }
}
