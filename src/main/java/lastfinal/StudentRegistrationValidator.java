package lastfinal;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

public interface StudentRegistrationValidator extends Function<Students, StudentRegistrationValidator.ValidationResult> {
    static StudentRegistrationValidator isNameValid() {
        return students -> students.getStudentName().isBlank() ?
                ValidationResult.SUCCESS : ValidationResult.NAME_NOT_VALID;
    }
    static StudentRegistrationValidator isEmailValid() {
        return students -> students.getEmail().contains("@") ?
                ValidationResult.SUCCESS : ValidationResult.EMAIL_NOT_VALID;
    }
    static StudentRegistrationValidator isPhoneNumberValid() {
        return students -> students.getMobileNumber().contains("0") ?
                ValidationResult.SUCCESS : ValidationResult.PHONE_NUMBER_NOT_VALID;
    }
    static StudentRegistrationValidator isAdult() {
        return students -> Period.between(students.getDob(), LocalDate.now()).getYears() > 16 ?
                ValidationResult.SUCCESS : ValidationResult.IS_NOT_ADULT;
    }
    default StudentRegistrationValidator and (StudentRegistrationValidator other){
        return students -> {
            ValidationResult result = this.apply(students);
            return result.equals(ValidationResult.SUCCESS) ? other.apply(students) : result;
        };
    }

    enum ValidationResult {
        SUCCESS,
        NAME_NOT_VALID,
        EMAIL_NOT_VALID,
        PHONE_NUMBER_NOT_VALID,
        IS_NOT_ADULT
    }
}
