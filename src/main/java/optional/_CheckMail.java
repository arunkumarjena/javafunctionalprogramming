package optional;

import java.util.Optional;

public class _CheckMail {
    public static void main(String[] args) {
        CehckEmail cehckEmail = new CehckEmail(null);
        String isEmailValid = cehckEmail
                .getCheckEmail()
                .map(String::toLowerCase)
                .orElse("Provided email is not valid");
        System.out.println(isEmailValid);
    }
    static class CehckEmail{
        private final String checkEmail;


        public CehckEmail(String checkEmail) {
            this.checkEmail = checkEmail;
        }

        public Optional<String> getCheckEmail() {
            return Optional.ofNullable(checkEmail);
        }
    }
}
