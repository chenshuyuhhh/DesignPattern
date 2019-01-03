package Proxy;

public class Main {
    public static void main(String[] args) {
        System.out.println("习题21-1测试");
        Printable printable = new PrinterProxy("chenshuyu","Printer");
        System.out.println("现在的名字是："+printable.getPrinterName()+".");
        printable.setPrinterName("csy");
        System.out.println("现在的名字是："+printable.getPrinterName()+".");
        printable.print("Hello csy!");
    }
}
