package nextstep.blackjack;

import nextstep.blackjack.Enum.Num;
import nextstep.blackjack.Enum.Suit;

import java.util.Objects;

public class Card {

    public static final int  ACE_VALUE = 11;
    private Suit suit;
    private Num num;

    public Card(Suit suit, Num num) {
        this.suit = suit;
        this.num = num;
    }

    public Num getNum() {
        return num;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", num=" + num +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;
        Card card = (Card) o;
        return suit == card.suit && num == card.num;
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, num);
    }
}
