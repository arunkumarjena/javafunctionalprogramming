package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PraticeDeclarativeApproch {
    public static void main(String[] args) {
        List<Person> personList = List.of(
                new Person("Sonal",22,Genders.MALE),
                new Person("Subhashree", 21,Genders.FEMALE),
                new Person("Nikita", 24,Genders.FEMALE),
                new Person("Aseema", 23,Genders.FEMALE),
                new Person("Sandeep", 21,Genders.MALE),
                new Person("Raj", 24,Genders.MALE),
                new Person("Silu", 22,Genders.MALE)
                );
        System.out.println("==============================================");
       personList.stream()
               .filter(person -> Genders.FEMALE.equals(person.gender))
               .collect(Collectors.toList())
               .forEach(System.out::println);
      List<Person> males = personList.stream()
               .filter(person -> Genders.MALE.equals(person.gender))
               .collect(Collectors.toList());
      males.forEach(System.out::println);
//               .forEach(System.out::println);

        // Imperative Approch
       List<Person> person = new ArrayList<>();
       for (Person peronsDetails : personList){
           if (peronsDetails.getPersonAge  <= 22){
               System.out.println(peronsDetails.personName +" : Age is " +" "+ +peronsDetails.getPersonAge);
           }
           person.add(peronsDetails);
       }

    }
    static class Person{
        private String personName;
        private int getPersonAge;
        private Genders gender;

        public Person(String personName, int getPersonAge, Genders gender) {
            this.personName = personName;
            this.getPersonAge = getPersonAge;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "personName='" + personName + '\'' +
                    ", getPersonAge='" + getPersonAge + '\'' +
                    ", gender=" + gender +
                    '}';
        }

    }
    enum Genders{
        MALE,FEMALE
    }

}
