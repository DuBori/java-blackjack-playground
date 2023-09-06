package nextstep.blackjack;

import nextstep.blackjack.Enum.Num;
import nextstep.blackjack.Enum.Suit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Cards {

    public static final int CARDS_MAX_TOTAL = 21;
    public static final int CARDS_MIN_TOTAL = 16;

    public static final Random RANDOM = new Random();
    private List<Card> list = new ArrayList<>();

    public Cards() {
        setCard();
    }
    public Cards(String temp) {}

    private void setCard() {
        Arrays.stream(Suit.values())
                .forEach(suit -> list.addAll(Arrays.stream(Num.values())
                        .map(num -> new Card(suit, num))
                        .collect(Collectors.toList())));
    }

    public void add(Card card) {
        list.add(card);
    }

    public Card popCard() {
       Card card = list.get(RANDOM.nextInt(list.size()));
       removeCard(card);
       return card;
    }

    private void removeCard(Card card) {
        list.remove(list.stream()
                .filter(it -> card.equals(it))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException()));
    }

    public boolean isContainAce() {
        return list.stream()
                .anyMatch(it -> Num.ACE.equals(it.getNum()));
    }

    public boolean isStopRange() {
        if (isContainAce()) {
            return isStopRangeIncludeAce();
        }
        return sum() <= Cards.CARDS_MAX_TOTAL && sum() > Cards.CARDS_MIN_TOTAL;
    }

    public boolean isStopRangeIncludeAce() {
        return containAceTotal() > Cards.CARDS_MIN_TOTAL && containAceTotal() <= Cards.CARDS_MAX_TOTAL;
    }

    public int sum() {
        return list.stream()
                .mapToInt(it -> it.getNum().getValue())
                .sum();
    }

    public int containAceTotal() {
        return Num.ACE_VALUE + list.stream()
                .filter(it -> it.notAce())
                .mapToInt(it -> it.getNum().getValue())
                .sum();
    }

    public boolean isBust() {
        return sum() > 21;
    }


    @Override
    public String toString() {
        return list.toString();
    }

    public List<Card> getList() {
        return list;
    }
}
