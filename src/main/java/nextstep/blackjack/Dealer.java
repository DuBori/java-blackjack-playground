package nextstep.blackjack;

import nextstep.blackjack.Enum.Num;

public class Dealer extends Human {

    public Dealer() {
    }

    public void settingInitCard(Cards cards) {
        while (!isPickThanTwo()) {
            pickCard(cards);
        }
        while (!this.cards.isStopRange()) {
            System.out.println("딜러는 16이하라 한장의 카드를 더 받았습니다.");
            pickCard(cards);
        }

    }


}
