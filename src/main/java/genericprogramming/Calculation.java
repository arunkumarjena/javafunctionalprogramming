package genericprogramming;

import java.util.function.Function;

public class Calculation {
    public static void main(String[] args) {
        // Calling generic method
        int resultOfAdditionOfNumber = additionOfNumber(10,20);
        System.out.println("Addition Of Number :" +resultOfAdditionOfNumber);


        // Function Calling
    }


    
    static int additionOfNumber(int fnum, int snum){
        return fnum + snum;
    }
    static int addOfNumberIncrementByOneMultiplyBy(int number, int multiplyBy){
        return (number + 1) * 10;
    }

}
