package BTVN1;

import java.util.Scanner;

public class School {
    private String schoolName;
    private String schoolDate;

    public School () {}
    public School(String schoolName, String schoolDate) {
        this.schoolName = schoolName;
        this.schoolDate = schoolDate;
    }
    public String getSchoolName() {
        return schoolName;
    }
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolDate() {
        return schoolDate;
    }
    public void setSchoolDate(String schoolDate) {
        this.schoolDate = schoolDate;
    }


}
