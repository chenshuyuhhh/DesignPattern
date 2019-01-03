package Proxy;

import java.lang.reflect.Constructor;

/**
 * 增加外部传入类名的构造函数
 */
public class PrinterProxy implements Printable {
    private String name;
    private Printable real;
    private String realStr;

    public PrinterProxy(){}

    public PrinterProxy(String name){
        this.name = name;
    }

    public PrinterProxy(String name,String realStr){
        this.name = name;
        this.realStr = realStr;
    }

    @Override
    public synchronized void setPrinterName(String name) {
        if (real!=null){
            real.setPrinterName(name);
        }
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        realize();
        real.print(string);
    }
    private synchronized void realize(){
        if (real == null ){
            if (realStr == null)real = new Printer(name);
            else{
                try {
                    Class c = Class.forName("Proxy."+realStr);
                    Constructor constructor = c.getConstructor();
                    real = (Printable) constructor.newInstance();
                }catch (ClassNotFoundException e){
                    System.err.println("no found " + realStr);
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
