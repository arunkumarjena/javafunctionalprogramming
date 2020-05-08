package revisionall;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
//        System.out.println(isPhoneNumberValid("+768206881812"));
//        System.out.println(isPhoneNumberValid("0768206881812"));
        System.out.println(isPhoneNumberValid.test("07123456781"));
        System.out.println(isPhoneNumberValid.test("071111237474"));

        System.out.println("is phone number contains number 3 " +isPhoneNumberValid.or(containNumber3).test("7538057290"));

    }
//    static boolean isPhoneNumberValid(String phoneNumber){
//        return phoneNumber.startsWith("07") && phoneNumber.length() == 12;
//    }
    static Predicate<String> isPhoneNumberValid = phoneNumber ->
        phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containNumber3 = phoneNumber ->
            phoneNumber.contains("3");

}
