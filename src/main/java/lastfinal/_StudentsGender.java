package lastfinal;

import java.util.ArrayList;
import java.util.List;

public class _StudentsGender {
    public static void main(String[] args) {

        List<Students> students = List.of(
                new Students("Chinmay",StudentGender.MALE),
                new Students("Rahul",StudentGender.MALE),
                new Students("Bipasha",StudentGender.FEMALE),
                new Students("Priyanka",StudentGender.FEMALE),
                new Students("Roshan",StudentGender.MALE)
        );
        List<String> list = new ArrayList<>();
        list.add("hiii");
        list.add("Hello");
        for (String printing : list){
            System.out.println(printing.toUpperCase());
        }
        System.out.println("Accessing by Imperative programming");
        for (Students std : students){
            System.out.println(std);
        }
//        students.stream()
//                .forEach(System.out::println);
//        students.stream()
//                .filter(std -> StudentGender.FEMALE.equals(std.gender))
//                .collect(Collectors.toList())
//                .forEach(System.out::println);
//        System.out.println("Printing males studetns lists :"+StudentGender.MALE);
//        students.stream()
//                .filter(males -> StudentGender.MALE.equals(males.gender))
//                .collect(Collectors.toList())
//                .forEach(System.out::println);
    }
    static class Students{
        private final String studentName;
        private final StudentGender gender;

        public Students(String studentName, StudentGender gender) {
            this.studentName = studentName;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Students{" +
                    "studentName='" + studentName + '\'' +
                    ", gender=" + gender +
                    '}';
        }

    }
    enum StudentGender{
        MALE,
        FEMALE,
        NOT_TO_SAY
    }
}
