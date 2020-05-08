package optional;

import java.util.Optional;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
//       Object value = Optional.ofNullable(null)
//                .orElseGet(() -> "default value");
//        System.out.println(value);
//        Supplier<IllegalStateException> exception = ()
//                -> new IllegalStateException("exception");
        Optional.ofNullable(null)
                .ifPresentOrElse(email -> System.out.println("Sending email to " + email),
                        () -> System.out.println("Can't send email"));
//        System.out.println(value);
    }
}
