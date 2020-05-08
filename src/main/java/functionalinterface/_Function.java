package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = incrment(20);
        System.out.println(increment);


        int increment2 = incrementByOneFunction.apply(30);
        System.out.println(increment2);


        int multiply = multiplyBy10Functin.apply(increment2);
        System.out.println(multiply);

        Function<Integer, Integer> addBy1AndThenMultiplyBy10 =
                incrementByOneFunction.andThen(multiplyBy10Functin);
        System.out.println(addBy1AndThenMultiplyBy10.apply(1));

        int result = incrementByOneAndMultiply(10,10);
        System.out.println(result);

        System.out.println(incrementByOneAndMultiply.apply(10,10));
    }
   static Function<Integer, Integer> incrementByOneFunction =
            number -> number + 1;

   static Function<Integer, Integer> multiplyBy10Functin =
           number -> number * 10;

   static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiply =
            (numberToIncrementByOne, numberToMultiplyBy)
                    -> (numberToIncrementByOne +1) * numberToMultiplyBy;
    // Regular Function
    static int incrment(int number){
        return number + 1;
    }

    static int incrementByOneAndMultiply(int number, int numToMultiplyBy){
        return (number + 1) * numToMultiplyBy;
    }


}
