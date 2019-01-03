package Bridge;

public class CoutDisplay extends Display{
    public CoutDisplay(DisplayImpl impl) {
        super(impl);
    }
    public void mutiDisplay(int times){
        open();
        for (int i = 0;i < times;i++){
            print();
        }
        close();
    }
}
