package nextstep.blackjack;

import nextstep.blackjack.Enum.Num;
import nextstep.blackjack.Enum.Suit;

public class Card {
    private Suit suit;
    private Num num;

    public Card(Suit suit, Num num) {
        this.suit = suit;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", num=" + num +
                '}';
    }
}
