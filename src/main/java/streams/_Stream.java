package streams;

import imperative.Main;

import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Arun",Gender.MALE),
                new Person("Ankita",Gender.FEMALE),
                new Person("Bedaningini",Gender.FEMALE),
                new Person("Silu",Gender.MALE)
        );
//        people.stream()
//                .map(person -> person.name)
//                .collect(Collectors.toSet())
//                .mapToInt(String::length)
//                .forEach(System.out::println);
        Predicate<Person> personPredicate = person -> Gender.PREFER_NOT_TO_SAY.equals(person.gender);

        boolean containsOnleyFemales = people.stream()
//                .allMatch(personPredicate);
//        .anyMatch(personPredicate);
        .noneMatch(personPredicate);
        System.out.println(containsOnleyFemales);


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
        MALE,FEMALE,PREFER_NOT_TO_SAY
    }
}
