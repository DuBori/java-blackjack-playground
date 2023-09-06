package nextstep.blackjack;

import nextstep.blackjack.Enum.Num;
import nextstep.blackjack.Enum.Suit;

import java.util.Objects;

public class Card {
    public static final String SPLITOR = "_";
    private Suit suit;
    private Num num;

    public Card(Suit suit, Num num) {
        this.suit = suit;
        this.num = num;
    }

    public boolean notAce() {
        return Num.ACE.equals(num);
    }

    public Num getNum() {
        return num;
    }

    @Override
    public String toString() {
        return num.name() + SPLITOR + suit.name();
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
