package lambdasecondpart;

import java.util.Arrays;
import java.util.List;

public class Sample3 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 30);
        // given an ordered list find the double of the first even number greater than 3.
        int result = 0;
        for (int e : numbers) {
            if (e > 3 && e % 2 == 0) {
                result = e * 2;
                break;
            }
        }
        System.out.println(result);
        System.out.println(
                numbers.stream()
                        .filter(e -> e > 3)
                        .filter(e -> e % 2 == 0)
                        .map(e -> e * 2)
                        .findFirst()
        );
        System.out.println(
                numbers.stream()
                        .filter(Sample3::isGT3)
                        .filter(Sample3::isEven)
                        .map(Sample3::doubleIt)
                        .findFirst()
        );


    }
    public static boolean isGT3(int number){
        System.out.println("Is GT3 " +number);
        return number > 3;
    }
    public static boolean isEven(int number){
        System.out.println("Is isEven " +number);
        return number % 2 == 0;
    }
    public static int doubleIt(int number){
        System.out.println("Is doubleIt " +number);
        return number * 2;
    }
}
