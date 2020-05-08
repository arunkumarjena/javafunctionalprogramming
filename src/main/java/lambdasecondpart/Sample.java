package lambdasecondpart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Sample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Timeit.code( () ->
        System.out.println(
                // numbers.parallelStream()
                numbers.stream()
                        .filter(e -> e % 2 == 0)
//                        .mapToInt(e -> compute(e))
                        .mapToInt(Sample::compute)
                        .sum()));
        // double even values put that into a list
        // wrong way to do this
        List<Integer> doubleOfEven = new ArrayList<>();
        numbers.stream()
                .filter(e -> e % 2 == 0)
                .map(e -> e * 2)
                .forEach(e -> doubleOfEven.add(e));
        // mutability is Ok, sharing is nice, shared mutability is devis work
         // dont do this
        System.out.println(doubleOfEven);

        List<Integer> doubleOfEven2 =
        numbers.stream()
                .filter(e -> e % 2 == 0)
                .map(e -> e * 2)
                .collect(toList());
        // mutability is Ok, sharing is nice, shared mutability is devis work
        // dont do this
        System.out.println(doubleOfEven2);
    }

    private static int compute(Integer e) {
        try {
            Thread.sleep(1000);
        }catch (Exception ex){ }
        return e * 2;
    }

}
