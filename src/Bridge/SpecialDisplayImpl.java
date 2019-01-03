package Bridge;

/**
 * 习题9-3 类的实现层次结构
 * start:开始字符，mediu：中间字符，end：结束字符
 */
public class SpecialDisplayImpl extends DisplayImpl {
    private char start;
    private char end;
    private char mediu;

    SpecialDisplayImpl(char start,char mediu,char end){
        this.start = start;
        this.mediu = mediu;
        this.end = end;
    }
    @Override
    public void rawOpen() {
        System.out.print(start);
    }

    @Override
    public void rawPrint() {
        System.out.print(mediu);
    }

    @Override
    public void rawClose() {
        System.out.println(end);
    }
}
