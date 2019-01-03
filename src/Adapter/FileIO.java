package Adapter;

import java.io.IOException;

public interface FileIO {
    void readFromFile(String filename) throws IOException;
    void writeFromFile(String filename) throws IOException;
    void setValue(String key,String value);
    String getValue(String key);
}
