package revisionall;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> person = List.of(
                new Person("Arun",Gender.MALE),
                new Person("Payal",Gender.FEMALE)
        );
        // Imperative approch
        List<Person> personList = new ArrayList<>();
        for (Person person1 : person){
            if (Gender.FEMALE.equals(person1.gender)){
                personList.add(person1);
            }
        }
        for (Person female : personList){
            System.out.println(female);
        }
        System.out.println("************Declarative Approch*****************");
        // Declarative approch
        person.stream()
                .filter(females -> Gender.FEMALE.equals(females.gender))
                .collect(Collectors.toList())
                .forEach(System.out::println);


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
