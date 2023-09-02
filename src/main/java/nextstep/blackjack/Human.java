package nextstep.blackjack;

public abstract class Human {

    public Cards cards = new Cards(null);

    public int totalPrice;

    public String name;

    public String getName() {
        return name;
    }

    public void pickCard(Cards cards, Card card) {
        cards.popCard(card);
        this.cards.getList().add(card);
    }


}
