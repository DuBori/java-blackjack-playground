package nextstep.blackjack;

public class Dealer extends Human {

    public Dealer() {
    }

    public boolean isNotStopRange() {
        if (cards.containsAce()) {
            return cards.aceSum() < Cards.CARDS_MIN_TOTAL;
        }
        return cards.sum() < Cards.CARDS_MIN_TOTAL;
    }

    public void take(int batPrice) {
        totalPrice += batPrice;
    }

}
