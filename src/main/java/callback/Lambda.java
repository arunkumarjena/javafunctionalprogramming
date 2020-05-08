package callback;

import java.util.function.Function;

public class Lambda {
    public static void main(String[] args) {

        Function<String, String> upperCaseName = name -> {
          if (name.isEmpty()) throw new IllegalArgumentException("");
          return name.toUpperCase();
        };

        String myName = upperCaseName.apply("Arun Kumar Jena");
        System.out.println(myName);
    }
}
