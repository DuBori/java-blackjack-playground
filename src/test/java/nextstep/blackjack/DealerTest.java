package nextstep.blackjack;

import nextstep.blackjack.Enum.Num;
import nextstep.blackjack.Enum.Suit;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

class DealerTest {
    public static Cards cards;
    public Dealer dealer;

    @BeforeEach
    void 초기값설정() {
        cards = new Cards();
        dealer = new Dealer();
    }
   /* @Test
    void 딜러멈춰야될에이스포함범위() {
        dealer.pickCard(cards, new Card(Suit.CLOVER, Num.ACE));
        dealer.pickCard(cards, new Card(Suit.CLOVER, Num.SIX));
        assertTrue(dealer.isStopRange());
    }

    @Test
    void 딜러가멈춰야될에이스포함실패범위() {
        dealer.pickCard(cards, new Card(Suit.CLOVER, Num.ACE));
        dealer.pickCard(cards, new Card(Suit.CLOVER, Num.FIVE));
        dealer.pickCard(cards, new Card(Suit.CLOVER, Num.SIX));
        assertFalse(dealer.isStopRange());
    }

    @Test
    void 딜러가멈춰야될범위() {
        dealer.pickCard(cards, new Card(Suit.DIAMOND, Num.KING));
        dealer.pickCard(cards, new Card(Suit.CLOVER, Num.EIGHT));
        assertTrue(dealer.isStopRange());
    }

    @Test
    void 딜러가멈춰야될범위실패케이스() {
        dealer.pickCard(cards, new Card(Suit.DIAMOND, Num.KING));
        dealer.pickCard(cards, new Card(Suit.CLOVER, Num.NINE));
        dealer.pickCard(cards, new Card(Suit.SPADE, Num.NINE));
        assertFalse(dealer.isStopRange());
    }*/





}