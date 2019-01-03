package Flyweight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BigChar {
    private char charname;
    private String fontdata;
    public BigChar(char name){
        System.out.println(name+"被创建");
        this.charname = name;
        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader("FlyweightTxt/big" + charname+".txt")
            );
            String line;
            StringBuffer buf = new StringBuffer();
            while ((line = reader.readLine())!=null){
                buf.append(line);
                buf.append("\n");
            }
            reader.close();
            this.fontdata = buf.toString();
        }catch (IOException e){
            e.printStackTrace();
            this.fontdata = charname + "?";
        }
    }

    public void print(){
        System.out.println(fontdata);
    }
}
