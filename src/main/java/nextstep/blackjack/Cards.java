package nextstep.blackjack;

import nextstep.blackjack.Enum.Num;
import nextstep.blackjack.Enum.Suit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cards {
    private List<Card> list = new ArrayList<>();

    public Cards() {
        setCard();
    }

    private void setCard() {
        Arrays.stream(Suit.values())
                .forEach(suit -> list.addAll(Arrays.stream(Num.values())
                        .map(num -> new Card(suit, num))
                        .collect(Collectors.toList())));
    }

    @Override
    public String toString() {
        return "Cards{" +
                "list=" + list +
                '}';
    }
}
