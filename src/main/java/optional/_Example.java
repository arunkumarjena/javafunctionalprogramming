package optional;

import java.util.Optional;

public class _Example {
    public static void main(String[] args) {
        Person person = new Person("Arun Jena",null);
        String email =  person
                .getEmail()
                .map(String::toLowerCase)
                .orElse("email is not provided");
        System.out.println(email);
    }
    static class Person{
        private String name;
        private String email;

        public Person(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public Optional<String> getEmail() {
            return Optional.ofNullable(email);
        }
    }
}
