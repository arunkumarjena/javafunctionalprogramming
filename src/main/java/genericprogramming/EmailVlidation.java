package genericprogramming;

import java.util.function.Predicate;

public class EmailVlidation {
    public static void main(String[] args) {
        System.out.println("Check is email valid or not "
                + isEmailIsValid.test("arunkumarjena18@gmail.com"));

        System.out.println("Check is email valid or not "
                + isEmailIsValid.test("arunkumarjena18gmail.com"));
    }

    static Predicate<String> isEmailIsValid = email ->
            email.contains("@gamil.com");
}
