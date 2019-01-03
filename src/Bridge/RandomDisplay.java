package Bridge;

/**
 * 带有"显示字符串若干（随机）次"的功能的类
 */

public class RandomDisplay extends Display {
    public RandomDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay(int times){
        int randomTimes = (int)(Math.random()*(times+1));
        open();
        for (int i =0 ;i<randomTimes;i++){
            print();
        }
        close();
    }
}
