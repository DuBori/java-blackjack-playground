package nextstep.blackjack;

import java.util.Objects;

public class User extends Human {

    private int batPrice;
    public User(String name, int batPrice) {
        super.name = name;
        this.batPrice = batPrice;
    }

    public int getBatPirce() {
        return batPrice;
    }

    public void take(int batPirce, double percent) {
        totalPrice += batPirce * percent;
    }

    public boolean isTowPick() {
        return cards.getList().size() == 2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}
