package Decorator;

import java.util.ArrayList;

public class MutiStringDisplay extends Display {
    ArrayList<String> arrayList = new ArrayList<>();

    @Override
    public int getColumns() {
        int max = 0;
        for (String temp : arrayList){
            if (max < temp.length()) max = temp.length();
        }
        return max;
    }

    @Override
    public int getRows() {
        return arrayList.size();
    }

    @Override
    public String getRowText(int row) {
        return getString(arrayList.get(row));
    }

    public void add(String str){
        arrayList.add(str);
    }

    private String getString(String str){
        StringBuffer sb = new StringBuffer(str);
        for (int i = sb.length();i<getColumns();i++){
            sb.append(' ');
        }
        return sb.toString();
    }
}
