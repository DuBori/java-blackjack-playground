package nextstep.blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Users {
    public static final int MIN_USER = 1;
    public static final int MAX_USER = 9;

    private List<User> users = new ArrayList<>();
    public Users() {}

    public List<User> getUsers() {
        return users;
    }

    public void addUser(String name, int batPirce) {
        users.add(new User(name, batPirce));
    }

    @Override
    public String toString() {
        return users.stream()
                .map(it -> it.getName()+": "+ it.cards.toString())
                .collect(Collectors.joining("\n"));
    }

    public void checkMember() {
        if (users.size() > MAX_USER || users.size() < MIN_USER) {
            throw new IllegalArgumentException("블랙잭 참가 인원은 최소 2명 ~최대 8명입니다.");
        }
    }
}
