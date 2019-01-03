package Bridge;

/**
 * 习题9-3 类的功能层次结构
 */
public class SpecialDisplay extends Display {
    public SpecialDisplay(DisplayImpl impl) {
        super(impl);
    }

    /**
     *
     * @param count 要输出cout行
     * @param d 每一行的中间字符比上一行多d个
     */
    public void specialDisplay(int count,int d){
        for (int i = 0;i<count;i++){
            open();
            for (int j = 0;j<i*d;j++){
                print();
            }
            close();
        }
    }
}
