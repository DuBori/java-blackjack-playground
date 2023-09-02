package nextstep.blackjack;

import java.util.List;
import java.util.Objects;

public class User extends Human {

    public User(String name, int price) {
        super.name = name;
        super.totalPrice = price;
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
