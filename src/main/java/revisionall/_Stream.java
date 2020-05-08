package revisionall;

import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class _Stream {
    public static void main(String[] args) {
        List<Students> students = List.of(
                new Students("Mrutyunjaya","23","150301120072",Gender.MALE),
                new Students("Sandeep","22","150301120069",Gender.MALE),
                new Students("Sudeep","22","150301120087",Gender.MALE),
                new Students("Meghalin","23","150301120091",Gender.FEMALE),
                new Students("Monalisha","22","150301120094",Gender.FEMALE)
                );
        students.stream()
                .map(students1 -> students1.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
        System.out.println("Printing Females Students Lists........... ");
        students.stream()
                .filter(females -> females.gender.equals(Gender.FEMALE))
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("Printing Males Students Lists.................");
        students.stream()
                .filter(males -> males.gender.equals(Gender.MALE))
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("Printing only students names............");
        Set<String> sutdentLists = students.stream()
                .map(studentsName -> studentsName.studentName)
                .collect(Collectors.toSet());
        System.out.println(sutdentLists);
        System.out.println("Printing names.......");
        students.stream()
                .map(studentsNames -> studentsNames.studentName)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("Calculationg names lengths......");
        Function<Students, String> studentsStringFunction = studentNamesFunction -> studentNamesFunction.studentName;
        ToIntFunction<String> length = String::length;
        IntConsumer println =  x -> System.out.println(x);

        students.stream()
                .map(studentsStringFunction)
                .mapToInt(length)
                .forEach(println);
        Predicate<Students> studentsPredicate = students1 -> Gender._NOT_TO_SAY.equals(students1.gender);
        boolean containsOnlyFemale = students.stream()
                .noneMatch(studentsPredicate);
        System.out.println(containsOnlyFemale);
        boolean containsOnlyMale = students.stream()
                .anyMatch(studentsPredicate);
    }




    static class Students{
        private final String studentName;
        private final String studentAge;
        private final String stduentRegdNumber;
        private final Gender gender;

        public Students(String studentName, String studentAge, String stduentRegdNumber, Gender gender) {
            this.studentName = studentName;
            this.studentAge = studentAge;
            this.stduentRegdNumber = stduentRegdNumber;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Students{" +
                    "studentName='" + studentName + '\'' +
                    ", studentAge='" + studentAge + '\'' +
                    ", stduentRegdNumber='" + stduentRegdNumber + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
    enum Gender{
        MALE,FEMALE,_NOT_TO_SAY
    }


}
