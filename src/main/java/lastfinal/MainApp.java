package lastfinal;

import java.time.LocalDate;

import static lastfinal.StudentRegistrationValidator.isNameValid;

public class MainApp {
    public static void main(String[] args) {
        Students students = new Students(
                "Arun Kumar Jena",
                "07682068818",
                "arun@gmail.com",
                LocalDate.of(2000, 04, 22)
        );
        System.out.println(new StudentValdatorService().isValid(students));
//    StudentValdatorService valdatorService = new StudentValdatorService();
//    valdatorService.isValid(students);
        // Using combinator pattern design
        StudentRegistrationValidator.ValidationResult result = isNameValid()
                .and(isNameValid())
                .and(StudentRegistrationValidator.isEmailValid())
                .and(StudentRegistrationValidator.isPhoneNumberValid())
                .and(StudentRegistrationValidator.isAdult())
                .apply(students);
        System.out.println(result);
        if(result != StudentRegistrationValidator.ValidationResult.SUCCESS){
            throw new IllegalStateException(result.name());
        }
        ;
    }
}
