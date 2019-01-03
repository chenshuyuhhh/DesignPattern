package Strategy.answer1of10;

import java.util.Random;

public class RandomStrategy implements Strategy {
    private boolean won;
   // private Random random;

//    public RandomStrategy(int seed){
//        random = new Random(seed);
//    }

    @Override
    public Hand nextHand() {
        return Hand.getHand(new Random().nextInt(3));
    }

    @Override
    public void study(boolean win) {
        this.won = win;
    }
}
