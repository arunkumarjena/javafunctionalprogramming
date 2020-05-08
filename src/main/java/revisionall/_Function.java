package revisionall;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        // calling normal method
        int incrment = increment(1);
        System.out.println(incrment);

        // lambda expression
        System.out.println(incrmentOfNumberByOne.apply(10));

        int multiply = inementByOneAndMultiplyBy11.apply(incrment);
        System.out.println(multiply);

        System.out.println("*********************");
        System.out.println(addByOneAndMultiply.apply(10,10));

    }

    static BiFunction<Integer, Integer, Integer> addByOneAndMultiply =
            (numberToadd, numberToMultiply) ->
                    (numberToadd + 2) * numberToMultiply;

    static Function<Integer, Integer> inementByOneAndMultiplyBy11 =
            number -> number * 11;
    static Function<Integer, Integer> incrmentOfNumberByOne =
            number -> number + 1;
    // Normal method
    static int increment(int number){
        return number + 1;
    }
}
