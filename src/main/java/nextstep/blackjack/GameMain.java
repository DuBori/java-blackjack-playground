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
        setCard(users);
        chooseMorePickCard(users);
        getMassage(users);
    }

    private static void getMassage(Users users) {
        System.out.println(dealer.toString());
        System.out.println(users.toString());
    }

    private static void chooseMorePickCard(Users users) {
        for (User user: users.getUsers()) {
            System.out.println(user.name+"는 한장의 카드를 더 받겠습니까?(예는 y, 아니오는 n)");
            String input = sc.next();
            do {
                morePick(user, input);
            }while (isInputYN(input) && !user.morePickCard());
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

    private static void setCard(Users users) {
        users.settingInitCard(cards);
        dealer.settingInitCard(cards);
        System.out.println(users);
        System.out.println("dealer : " + dealer.toString());
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
        users.setMoney(name, sc.nextInt());
    }


    private static void settingCard(List<User> users) {
        for (int i = 0; i < 2; i++) {

        }
    }
}
