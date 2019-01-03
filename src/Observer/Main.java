package Observer;

public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberGenerator();
        Observer o1 = new DigitObserver();
        Observer o2 = new GraphObserver();
        generator.addObserver(o1);
        generator.addObserver(o2);
        generator.execute();

        System.out.println("习题17-1测试：");
        NumberGenerator generator1 = new IncrementalNumberGenerator(10,50,5);
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        generator1.addObserver(observer1);
        generator1.addObserver(observer2);
        generator1.execute();

        System.out.println("习题17-2测试:");
        NumberGenerator generator2 = new RandomNumberGenerator();
        Observer ob1 = new DigitObserver();
        Observer ob2 = new GraphObserver();
        Observer ob3 = new ConcreteObserver();
        generator2.addObserver(ob1);
        generator2.addObserver(ob2);
        generator2.addObserver(ob3);
        generator.execute();
    }
}
