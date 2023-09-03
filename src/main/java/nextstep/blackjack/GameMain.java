package nextstep.blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameMain {

    static Cards cards;
    static Scanner sc;

    static Dealer dealer;

    public static void main(String[] args) {
        playBlackJack();
    }

    private static void playBlackJack() {
        setting();
        List<User> users = settingPlayer();
        settingCard(users);
    }
    private static void setting() {
        cards = new Cards();
        sc = new Scanner(System.in);
        dealer = new Dealer();
    }
    private static List<User> settingPlayer() {
        System.out.println("게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)");
        String input = sc.next();
        return makePlayer(input);
    }

    private static List<User> makePlayer(String input) {
        List<User> users = new ArrayList<>();
        if (input.contains(",")) {
            String[] split = input.split(",");
            for (String name : split) {
                setGameMoney(users, name);
            }
            return users;
        }
        setGameMoney(users, input);
        return users;
    }

    private static void setGameMoney(List<User> users, String name) {
        System.out.print(name+"의 배팅 금액은?");
        users.add(new User(name, sc.nextInt()));
    }

    private static void settingCard(List<User> users) {
        for (int i = 0; i < 2; i++) {

        }
    }
}
