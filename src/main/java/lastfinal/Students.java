package lastfinal;

import java.time.LocalDate;

public class Students {
    private final String studentName;
    private final String mobileNumber;
    private final String email;
    private final LocalDate dob;

    public Students(String studentName, String mobileNumber, String email, LocalDate dob) {
        this.studentName = studentName;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.dob = dob;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDob() {
        return dob;
    }
}
