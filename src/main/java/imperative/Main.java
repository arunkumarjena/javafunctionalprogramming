package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> person = List.of(
                new Person("Arun",Gender.MALE),
                new Person("Monalisha",Gender.FEMALE),
                new Person("Sudeep",Gender.MALE),
                new Person("Sushree",Gender.FEMALE)

        );
        System.out.println("Imperative approch");
        // Imperative Approch
        List<Person> persons = new ArrayList<>();

        for (Person person1 : person){
            if (Gender.FEMALE.equals(person1.gender)){
                persons.add(person1);
            }
        }

        for (Person female : persons){
            System.out.println(female);
        }
        System.out.println("Declrative approch");
        // Declarative Approch
        person.stream()
                .filter(person1 -> Gender.FEMALE.equals(person1.gender))
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("Printing males");
        person.stream()
                .filter(person1 -> Gender.MALE.equals(person1.gender))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // Predicate function
        Predicate<Person> personPredicate = person1 -> Gender.FEMALE.equals(person1.gender);

        List<Person> females2 = person.stream()
                .filter(personPredicate)
                .collect(Collectors.toList());
        females2.forEach(System.out::println);
    }
    static class Person{
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
    enum Gender{
        MALE,FEMALE
    }
}
