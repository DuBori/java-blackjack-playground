package nextstep.blackjack;

import nextstep.blackjack.Enum.Num;

public class Dealer extends Human {

    public Dealer() {
    }

    public void settingInitCard(Cards cards) {
        while (!isPickThanTwo()) {
            pickCard(cards);
        }
        if (!cards.isContainAce() && !cards.isStopRange() || cards.isContainAce() && !cards.isStopRange()) {
            pickCard(cards);
        }
    }
}
