package nextstep.fp;

import java.util.Arrays;
import java.util.List;

public class Lambda {
    public static void printAllOld(List<Integer> numbers) {
        System.out.println("printAllOld");

        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void printAllLambda(List<Integer> numbers) {
        System.out.println("printAllLambda");

        numbers.forEach(System.out::println);
    }

    public static void runThread() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from thread");
            }
        }).start();
    }

    public static int sumAll(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(value -> value).sum();
    }

    public static int sumAllEven(List<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                total += number;
            }
        }
        return numbers.stream()
                .filter(it -> it % 2 == 0)
                .mapToInt(value -> value)
                .sum();
    }

    public static int sumAllOverThree(List<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
            if (number > 3) {
                total += number;
            }
        }
        return numbers.stream()
                .filter(it -> it > 3)
                .mapToInt(value -> value)
                .sum();
    }
}
