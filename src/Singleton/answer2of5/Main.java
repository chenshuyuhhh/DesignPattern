package Singleton.answer2of5;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        Triple triple1 = Triple.getInstance(1);
        Triple triple2 = Triple.getInstance(2);
        Triple triple3 = Triple.getInstance(3);
        Triple triple11 = Triple.getInstance(1);
        if (triple1 == triple11){
            System.out.println("两个Triple是相同实例");
        }else {
            System.out.println("两个Triple不是相同实例");
        }
        System.out.println("End.");
    }
}
