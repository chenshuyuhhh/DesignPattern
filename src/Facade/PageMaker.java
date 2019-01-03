package Facade;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PageMaker {
    private PageMaker(){}

    public static void welcome(String mailaddr,String filename) {
        try {
            Properties mailprop = Database.getProperties("maildata");
            String username = mailprop.getProperty(mailaddr);
            HtmlWriter writer = new HtmlWriter(new FileWriter("FacadeHtml/"+filename));
            writer.title("Welcome to " + username + "'s page!");
            writer.paragragh("wait  for you!");
            writer.paragragh("you are so great!");
            writer.mailto(mailaddr,username);
            writer.close();
            System.out.println(filename + " is created for " + mailaddr + "(" + username + ")");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void makeLinePage(String filename) {
        try {
            HtmlWriter writer = new HtmlWriter(new FileWriter("FacadeHtml/"+filename));
            writer.title("Link page");
            Properties properties = Database.getProperties("maildata");
            Enumeration en = properties.propertyNames();
            while (en.hasMoreElements()){
                String mailaddr = (String) en.nextElement();
                String username = properties.getProperty(mailaddr,"(unknow)");
                writer.mailto(mailaddr,username);
            }
            writer.close();
            System.out.println(filename+" is craeted.");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
