package genericprogramming;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Students> studentsList = List.of(
                new Students("Arun Kumar Jena","150301120071",Gender.MALE),
                new Students("Sandeep Palai","150301120069",Gender.MALE),
                new Students("Meghalin Pani","150301120091",Gender.FEMALE)
        );
        // Imperative Approch
        List<Students> list = new ArrayList<>();
        for (Students students : list){
            if (Gender.FEMALE.equals(students.gender)){
                System.out.println(students.studentName);
            }

        }
    }
    static class Students{
        private final String studentName;
        private final String studentRegno;
        private final Gender gender;

        public Students(String studentName, String studentRegno, Gender gender) {
            this.studentName = studentName;
            this.studentRegno = studentRegno;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Students{" +
                    "studentName='" + studentName + '\'' +
                    ", studentRegno='" + studentRegno + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
    enum  Gender{
        MALE,FEMALE
    }

}
