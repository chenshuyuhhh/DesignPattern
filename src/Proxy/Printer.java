package Proxy;

public class Printer implements Printable {
    private String name;

    public Printer() {
        heavyJob("正在生成 Printer 的实例");
    }

    public Printer(String name) {
        this.name = name;
        heavyJob("正在生成 Printer 的实例( " + name + ")");
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        System.out.println("=== " + name + " ===");
        System.out.println(string);
    }

    private void heavyJob(String msg) {
        System.out.println(msg);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("end.");
    }
}
