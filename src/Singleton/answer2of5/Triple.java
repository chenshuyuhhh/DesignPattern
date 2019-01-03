package Singleton.answer2of5;

public class Triple {
    private static int id = 1;
    private static Triple triple1 = new Triple(1);
    private static Triple triple2 = new Triple(2);
    private static Triple triple3 = new Triple(3);

    private Triple(int id) {
        System.out.println("你创建的Triple实例化对象的ID是："+id);
        this.id = id;
    }

    public static Triple getInstance(int id) {
        switch (id) {
            case 1:
                return triple1;
            case 2:
                return triple2;
            case 3:
                return triple3;
            default:
                System.out.println("你输入的id不合法，请重新输入");
                break;
        }
        return null;
    }
}
