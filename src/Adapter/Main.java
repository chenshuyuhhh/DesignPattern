package Adapter;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try {
            f.readFromFile("AdapterTest/adapterTest.txt");
            f.setValue("year","2019");
            f.setValue("month","1");
            f.setValue("day","1");
            f.writeFromFile("AdapterTest/adapterResult.txt");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
