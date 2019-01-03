package Adapter;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try {
            f.readFromFile("/Users/chenshuyu/Documents/study/程序设计实践/adapterTest.txt");
            f.setValue("year","2019");
            f.setValue("month","1");
            f.setValue("day","1");
            f.writeFromFile("/Users/chenshuyu/Documents/study/程序设计实践/adapterResult.txt");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
