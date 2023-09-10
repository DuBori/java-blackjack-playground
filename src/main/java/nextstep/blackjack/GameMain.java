package nextstep.blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameMain {

    static Cards cards = new Cards();
    static Scanner sc = new Scanner(System.in);

    static Dealer dealer = new Dealer();

    public static void main(String[] args) {
        playBlackJack();
    }

    private static void playBlackJack() {
        Users users = settingPlayer();
        settingInitCard(users);
        chooseMorePickCard(users);
        getMassage(users);
    }

    private static void chooseMorePickCard(Users users) {
        for (User user : users.getUsers()) {
            System.out.println(user.name + "는 한장의 카드를 더 받겠습니까?(예는 y, 아니오는 n)");
            String input = sc.next();
            do {
                morePick(user, input);
            } while (isInputYN(input));
        }
        while (dealer.isNotStopRange()) {
            System.out.println("딜러는 16이하라 한장의 카드를 더 받았습니다.");
            dealer.pickCard(cards);
        }
    }
    private static void morePick(User user, String input) {
        if ("y".equals(input)) {
            System.out.println(user.name + ":" + user.pickCard(cards).toString());
        }
    }
    private static boolean isInputYN(String input) {
        if ("y".equals(input) || "n".equals(input)) {
            return false;
        }
        System.out.println("y 또는 n 값을 입력해 주세요.");
        return true;
    }

    private static void settingInitCard(Users users) {
        for (int i = 0; i < 2; i++) {
            for (User user : users.getUsers()) {
                user.pickCard(cards);
            }
            dealer.pickCard(cards);
        }
        System.out.println(users);
        System.out.println("dealer : "+ dealer);
    }

    private static Users settingPlayer() {
        System.out.println("게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)");
        String input = sc.next();
        return makePlayer(input);
    }

    private static Users makePlayer(String input) {
        Users users = new Users();

        String[] split = input.split(",");
        for (String name : split) {
            System.out.println(name + "의 배팅 금액은?");
            users.addUser(name, sc.nextInt());
        }
        users.checkMember();
        return users;
    }

    private static void getMassage(Users users) {
        System.out.println("딜러 : "+dealer);
        System.out.println(users);

        for (User user : users.getUsers()) {
            result(user);
        }
        System.out.println("딜러ㅏ : " + dealer.getTotalPrice());
        for (User user : users.getUsers()) {
            System.out.println(user.name + ": " + user.getTotalPrice());
        }
    }

    private static void result(User user) {
        if (user.score() == Cards.CARDS_MAX_TOTAL && dealer.score() == Cards.CARDS_MAX_TOTAL) {
            user.take(user.getBatPirce(), 1);
        }
        if (user.isTowPick() && user.score() == Cards.CARDS_MAX_TOTAL) {
            user.take(user.getBatPirce(), 1.5);
        }
        if (user.score() > Cards.CARDS_MAX_TOTAL) {
            dealer.take(user.getBatPirce());
        }
        if (dealer.score() > Cards.CARDS_MAX_TOTAL) {
            user.take(user.getBatPirce(), 2);
        }
        if (user.score() > dealer.score()) {
            user.take(user.getBatPirce(), 2);
        }
        if (user.score() <= dealer.score()) {
            dealer.take(user.getBatPirce());
        }
    }
}
