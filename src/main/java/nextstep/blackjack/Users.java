package nextstep.blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Users {

    private List<User> users = new ArrayList<>();

    public Users() {}

    public void setMoney(String name, int batPrice) {
        users.add(new User(name, batPrice));
    }

    public void settingInitCard(Cards cards) {
        for (int i = 0; i < 2; i++) {
            for (User user : users) {
                user.pickCard(cards);
            }
        }
    }

    public List<User> getUsers() {
        return users;
    }

    @Override
    public String toString() {
        return users.stream()
                .map(it -> it.getName()+": "+ it.cards.toString())
                .collect(Collectors.joining("\n"));
    }
}
