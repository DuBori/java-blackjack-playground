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
        list.remove(list.indexOf(card));
    }

    public boolean containsAce() {
        return list.stream()
                .anyMatch(it -> Num.ACE.equals(it.getNum()));
    }


    public int sum() {
        return list.stream()
                .mapToInt(it -> it.getNum().getValue())
                .sum();
    }

    public int aceSum() {
       List<Card> collect = list.stream().filter(it -> it.equalsAce())
               .collect(Collectors.toList());
       int size = collect.size();
       collect.forEach(it -> list.remove(it));
       return sum() + 11 + (size - 1);
    }

    @Override
    public String toString() {
        return list.toString();
    }

    public List<Card> getList() {
        return list;
    }
}
