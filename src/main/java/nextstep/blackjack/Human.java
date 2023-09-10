package nextstep.blackjack;

public abstract class Human {

    public Cards cards = new Cards(null);

    public int totalPrice;

    public String name;

    public String getName() {
        return name;
    }

    public Card pickCard(Cards cards) {
        Card card = cards.popCard();
        this.cards.add(card);
        return card;
    }

    public int score() {
        if (cards.containsAce()) {
            return cards.aceSum();
        }
        return cards.sum();
    }

    @Override
    public String toString() {
        return cards.toString();
    }

    public int getTotalPrice() {
        return totalPrice;
    }
}
