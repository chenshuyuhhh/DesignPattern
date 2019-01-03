package Observer;

/**
 * 使number递增
 */
public class IncrementalNumberGenerator extends NumberGenerator {
    private int start;
    private int end;
    private int se;
    private int number;
    public IncrementalNumberGenerator(int start,int end,int se){
        this.start = start;
        this.end = end;
        this.se = se;
        this.number = start;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        for (int i = start;i<end;i+=se){
            number = i;
            notifyObservers();
        }
    }
}
