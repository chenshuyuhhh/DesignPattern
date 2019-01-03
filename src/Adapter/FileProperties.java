package Adapter;

import java.io.*;
import java.util.Date;
import java.util.Properties;

public class FileProperties implements FileIO {
    Properties properties = new Properties();

    @Override
    public void readFromFile(String filename) throws IOException {
        InputStream in = new FileInputStream(filename);
        properties.load(in);
    }

    @Override
    public void writeFromFile(String filename) throws IOException {
        Date date = new Date();
        OutputStream out = new FileOutputStream(filename);
        String header = "Write by FileProperties\n#"+ date.toString();
        properties.store(out,header);
    }

    @Override
    public void setValue(String key, String value) {
        properties.setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        properties.getProperty(key);
        return null;
    }
}
