package lambdasecondpart;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.*;

enum Gender {
    MALE, FEMALE
}

class Person {
    private final String name;
    private final Gender gender;
    private final String age;

    public Person(String name, Gender gender, String age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public String getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age='" + age + '\'' +
                '}';
    }
}

public class Sample2 {
    public static List<Person> createPepole() {
        return Arrays.asList(
                new Person("Sara", Gender.FEMALE, "20"),
                new Person("Sara", Gender.FEMALE, "22"),
                new Person("Bob", Gender.MALE, "20"),
                new Person("Paula", Gender.FEMALE, "32"),
                new Person("Paul", Gender.MALE, "32"),
                new Person("Jack", Gender.MALE, "2"),
                new Person("Jack", Gender.MALE, "72"),
                new Person("Jill", Gender.FEMALE, "12")
        );
    }

    public static void main(String[] args) {
        List<Person> people = createPepole();

        System.out.println(
                people.stream()
                        .collect(toMap(
                                person -> person.getName() + " - " + person.getAge(),
                                person -> person
                        )));
        System.out.println("Grouping By Name");
        System.out.println(
                people.stream()
                        .collect(groupingBy(Person::getName,
                                mapping(Person::getAge,toList())))
        );

    }

}
