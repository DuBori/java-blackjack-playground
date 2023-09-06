package nextstep.blackjack;

public abstract class Human {

    public Cards cards = new Cards(null);

    public int totalPrice;

    public String name;

    public String getName() {
        return name;
    }

    public void pickCard(Cards cards) {
        Card card = cards.popCard();
        this.cards.add(card);
    }

    public boolean isPickThanTwo() {
        return cards.getList().size() >= 2;
    }

    @Override
    public String toString() {
        return cards.toString();
    }

}
