package nextstep.blackjack;

import nextstep.blackjack.Enum.Num;
import nextstep.blackjack.Enum.Suit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cards {

    public static final int CARDS_MAX_TOTAL = 21;
    public static final int CARDS_MIN_TOTAL = 16;
    private List<Card> list = new ArrayList<>();

    public Cards() {
        setCard();
    }
    public Cards(String temp) {

    }

    private void setCard() {
        Arrays.stream(Suit.values())
                .forEach(suit -> list.addAll(Arrays.stream(Num.values())
                        .map(num -> new Card(suit, num))
                        .collect(Collectors.toList())));
    }

    public void popCard(Card card) {
        list.remove(list.stream()
                .filter(it -> card.equals(it))
                .findFirst()
                .orElseThrow( () -> new IllegalArgumentException()));
    }
    public List<Card> getList() {
        return list;
    }

    @Override
    public String toString() {
        return "Cards{" +
                "list=" + list +
                '}';
    }
}
