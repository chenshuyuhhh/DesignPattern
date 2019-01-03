package Flyweight;

public class Main {
    public static void main(String[] args) {

        System.out.println("习题20-1以及20-2测试：");
        System.out.println("不共享实例时：");
        BigString bs1 = new BigString("01791-07", false);
        bs1.print();
        Runtime.getRuntime().gc();
        long used = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("使用内存 = " + used + "\n\n");
        System.out.println("共享实例时：");
        BigString bs2 = new BigString("01791-07", true);
        bs2.print();
        Runtime.getRuntime().gc();
        long used2 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("使用内存 = " + used2);
    }
}
