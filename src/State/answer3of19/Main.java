package State.answer3of19;

public class Main {
    public static void main(String[] args) {
        SafeFrame frame = new SafeFrame("State Sample");
        Test(frame);
        return;
    }

    public static void Test(SafeFrame frame) {
        while (true){
            for (int hour = 0;hour<24;hour++){
                frame.setClock(hour);
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
