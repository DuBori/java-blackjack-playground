package nextstep.blackjack;

import java.util.List;
import java.util.Objects;

public class User implements Human {
    private List<Card> list;
    private String name;
    private int money;

    public User(String name) {

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

    @Override
    public void pick() {

    }
}
