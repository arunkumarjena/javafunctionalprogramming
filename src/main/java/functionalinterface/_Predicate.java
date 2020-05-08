package functionalinterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println("Without Predicate");
        System.out.println(isPhoneNumberValid("917682068818"));
        System.out.println(isPhoneNumberValid("7682068818"));

        System.out.println("With Predicate");
        System.out.println(isPhoneNUmberValidPredicate.test("917682068818"));
        System.out.println(isPhoneNUmberValidPredicate.test("7682068818"));

        System.out.println("Check Phone Number Contains 3 or not");

        System.out.println("is phone number valid and contains number 3 = "
                + isPhoneNUmberValidPredicate.and(isPhoneNumberContains3).test("917682068818"));
        System.out.println("is phone number valid and contains number 3 = "
                + isPhoneNUmberValidPredicate.and(isPhoneNumberContains3).test("917682063818"));

    }

    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("91") && phoneNumber.length() == 12;
    }
    static BiPredicate<String, String> isPhoneNumberValidPredicateContains =
            (phoneNumberValid, phoneNumberLength) ->
                    phoneNumberValid.startsWith("91") && phoneNumberLength.length() == 12;

    static Predicate<String> isPhoneNUmberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("91") && phoneNumber.length() == 12;

    static Predicate<String> isPhoneNumberContains3 = phoneNumber ->
            phoneNumber.contains("3");
}
