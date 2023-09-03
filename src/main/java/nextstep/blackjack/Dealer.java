package nextstep.blackjack;

import nextstep.blackjack.Enum.Num;

public class Dealer extends Human {

    public Dealer() {
    }

    public boolean isStopRange() {
        if (isContainAce()) {
            return containAceTotal() > Cards.CARDS_MIN_TOTAL && containAceTotal() <= Cards.CARDS_MAX_TOTAL;
        }
        return sum() <= Cards.CARDS_MAX_TOTAL && sum() > Cards.CARDS_MIN_TOTAL;
    }
    private boolean isContainAce() {
        return super.cards.getList()
                .stream()
                .anyMatch(it-> Num.ACE == it.getNum());
    }
    private int containAceTotal() {
        return Num.ACE_VALUE + super.cards.getList()
                .stream()
                .filter(it -> Num.ACE != it.getNum())
                .mapToInt(it-> it.getNum().getValue())
                .sum();
    }

    private int sum() {
        return super.cards.getList()
                .stream()
                .mapToInt(it -> it.getNum().getValue())
                .sum();
    }


}
