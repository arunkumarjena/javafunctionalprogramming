package optional;
import java.util.Optional;

public class _Optional {
    public static void main(String[] args) {
//        Optional<Object> optional = Optional.empty();

        // it will check in optional data is present or not
//        System.out.println(optional.isPresent());

        // it will check optional is empty or not
//        System.out.println(optional.isEmpty());
        Optional<String> optional = Optional.ofNullable(null) ;
        System.out.println(optional.isPresent());
        System.out.println(optional.isEmpty());


//        String orElse = optional
//                .orElse("Helloo");
//                    .map(String::toUpperCase)
//                    .orElseGet(() -> {
//                       return "hello";
//                    });
//        .orElseThrow(IllegalAccessError::new);
//        System.out.println(orElse);
        optional.ifPresentOrElse(word ->{
            System.out.println(word);
        },()->{
            System.out.println("working");
        });
    }
}
