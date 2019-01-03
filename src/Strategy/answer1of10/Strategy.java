package Strategy.answer1of10;

import Strategy.answer1of10.Hand;

public interface Strategy {
    public abstract Hand nextHand();
    public abstract void study(boolean win);
}
