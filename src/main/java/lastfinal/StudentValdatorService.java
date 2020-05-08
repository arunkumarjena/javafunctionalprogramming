package lastfinal;

import java.time.LocalDate;
import java.time.Period;

public class StudentValdatorService {
    private boolean isNameValid(String name){
        if (name != null){
            return true;
        }else {
            System.out.println("email is not valid");
            return false;
        }
    }
    private boolean isEmailValid(String email){
        return email.contains("@");
    }
    private boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("0");
    }
    private boolean isAdult(LocalDate dob){
        return Period.between(dob, LocalDate.now()).getYears() > 16;
    }
    public boolean isValid(Students students){
        return isNameValid(students.getStudentName()) &&
                isEmailValid(students.getEmail()) &&
                isPhoneNumberValid(students.getMobileNumber()) &&
                isAdult(students.getDob());
    }

}
