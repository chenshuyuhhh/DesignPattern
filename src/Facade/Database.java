package Facade;

import java.io.FileInputStream;
import java.util.Properties;

public class Database {
    private Database() {
    }

    public static Properties getProperties(String dbname) {
        String filename = "FacadeHtml/" + dbname + ".txt";
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(filename));
        } catch (Exception e) {
            System.out.println("Warning:" + filename + " is not found.");
        }
        return properties;
    }
}
