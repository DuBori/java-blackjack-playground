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
        Users users = settingPlayer();
        users.settingInitCard(cards);
        dealer.settingInitCard(cards);
        System.out.println(users);
        System.out.println("dealer : " + dealer.toString());
        users.isPickMore();
    }
    private static void setting() {
        cards = new Cards();
        sc = new Scanner(System.in);
        dealer = new Dealer();
    }
    private static Users settingPlayer() {
        System.out.println("게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)");
        String input = sc.next();
        return makePlayer(input);
    }

    private static Users makePlayer(String input) {
        Users users = new Users();
        if (input.contains(",")) {
            String[] split = input.split(",");
            for (String name : split) {
                make(users, name);
            }
            return users;
        }
        make(users, input);
        return users;
    }

    private static void make(Users users, String name) {
        System.out.print(name + "의 배팅 금액은?");
        users.setMoney(name,sc.nextInt());
    }


    private static void settingCard(List<User> users) {
        for (int i = 0; i < 2; i++) {

        }
    }
}
