package nextstep.blackjack.Enum;

public enum Num {

    ACE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(10),
    QUEEN(10),
    KING(10);
    public static final int  ACE_VALUE = 11;
    private int value;
    Num(int num) {
        this.value = num;
    }

    public boolean equalsAce() {
        return this == ACE;
    }
    public int getValue() {
        return value;
    }

}
