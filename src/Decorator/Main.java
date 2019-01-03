package Decorator;

public class Main {
    public static void main(String[] args) {
        // 12-1测试
        Display b1 = new StringDispay("Hello ,world.");
        Display b2 = new UpDownBorder(b1,'-');
        Display b3 = new SideBorder(b2,'*');
        b1.show();
        b2.show();
        b3.show();
        Display b4 = new FullBorder(
                new UpDownBorder(
                        new SideBorder(
                                new UpDownBorder(
                                        new SideBorder(
                                                new StringDispay("hello,teacher."),
                                                '*'
                                        ),
                                        '='
                                ),
                                '|'
                        ),
                        '/'
                )
        );
        b4.show();

        // 12-2测试
        MutiStringDisplay mutiStringDisplay = new MutiStringDisplay();
        mutiStringDisplay.add("chenshuyu");
        mutiStringDisplay.add("3017218119");
        mutiStringDisplay.add("good");
        mutiStringDisplay.add("a cute pig");
        mutiStringDisplay.show();

        Display d5 = new SideBorder(mutiStringDisplay,'#');
        d5.show();

        Display d6 = new FullBorder(mutiStringDisplay);
        d6.show();
    }
}
