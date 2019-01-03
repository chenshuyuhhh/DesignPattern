package Bridge;

public class Main {
    public static void main(String[] args) {
        Display display = new Display(new StringDisplayImpl("Hello,Tian Jin"));
        Display displayCount = new CoutDisplay(new StringDisplayImpl("Hello,TJU"));
        CoutDisplay coutDisplay = new CoutDisplay(new StringDisplayImpl("Hello,Universe"));
        display.display();
        displayCount.display();
        coutDisplay.display();

        //习题9-1测试
        Display displayRandom = new RandomDisplay(new StringDisplayImpl("Hello,chenshuyu"));
        RandomDisplay randomDisplay = new RandomDisplay(new StringDisplayImpl("Hello,teacher"));
        displayRandom.display();
        ((RandomDisplay) displayRandom).randomDisplay(24);
        randomDisplay.display();
        coutDisplay.mutiDisplay(10);
        randomDisplay.randomDisplay(19);
        randomDisplay.randomDisplay(7);

        //习题9-2测试
        Display display1 = new Display(new TextDipsplayImpl("/Users/chenshuyu/Documents/study/大二 上/java/程序设计实践2/test.txt"));
        display1.display();

        //习题9-3测试
        Display display2 = new SpecialDisplay(new SpecialDisplayImpl('<','*','>'));
        ((SpecialDisplay) display2).specialDisplay(4,1);
        Display display3 = new SpecialDisplay(new SpecialDisplayImpl('|','#','-'));
        ((SpecialDisplay) display3).specialDisplay(6,2);
    }
}
