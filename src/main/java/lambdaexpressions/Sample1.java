package lambdaexpressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
//import java.util.stream.Collectors;

public class Sample1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // External Iterator(you control iteration from your side)
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        System.out.println("Using for each");
        for (int e : numbers) {
            System.out.println(e);
        }

        System.out.println("Lambda Code");
        numbers.stream()
//                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("internal iterator");
        numbers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        System.out.println("internal iterator");
        numbers.forEach((Integer integer) -> System.out.println(integer));

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        numbers.forEach(e -> System.out.println(e));
        numbers.forEach(System.out::println);

        System.out.println("All numbers converted into string...");
        numbers.stream()
//                .map(e -> Integer.toString(e))
//                .map(e -> String.valueOf(e))      --> Parameter becoming as argument
                // or shortest
                .map(String::valueOf)
                .forEach(System.out::println);

        // parameter becoming as target
        numbers.stream()
                .map(e -> String.valueOf(e))
//                .map(e -> e.toString())
//                .forEach(System.out::println)
                .map(String::toString)
                .forEach(System.out::println);

        System.out.println(
                numbers.stream()
//                .reduce(0, (total, e) -> Integer.sum(total, e)));

                        .reduce(0, Integer::sum));

        System.out.println(
                numbers.stream()
                        .map(String::valueOf)
//                .reduce("",(carry, str) -> carry.concat(str))
                        .reduce("", String::concat)
        );

        // Given two values, double the even numbers and total

        // By Imperative
        int result = 0;
        for (int e : numbers) {
            if (e % 2 == 0) {
                result += e * 2;
            }
        }
        System.out.println(result);

        // By FunctionalProgrammming
        System.out.println(
                numbers.stream()
                        .filter(e -> e % e == 0)
                        .map(e -> e * 2)
                        .reduce(0, Integer::sum)
        );

        // By FunctionalProgrammming
        System.out.println(
                numbers.stream()
                        .filter(e -> e % e == 0)
                        .mapToInt(e -> e * 2)
                        .sum()
        );
        List<Integer> doubleOfEven =
                numbers.stream()
                        .filter(e -> e % 2 == 0)
                        .map(e -> e * 2)
                        .collect(Collectors.toList());
        System.out.println(doubleOfEven);

    }
}
