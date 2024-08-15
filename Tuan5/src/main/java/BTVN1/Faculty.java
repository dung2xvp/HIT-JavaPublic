package BTVN1;

import java.util.Scanner;

public class Faculty {
    private String facultyName;
    private String facultyDate;
    School x = new School ();

    public Faculty() {}
    public Faculty(String facultyName, String facultyDate, School x) {
        this.facultyName = facultyName;
        this.facultyDate = facultyDate;
        this.x = x;
    }

    public String getFacultyName() {
        return facultyName;
    }
    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getFacultyDate() {
        return facultyDate;
    }
    public void setFacultyDate(String facultyDate) {
        this.facultyDate = facultyDate;
    }

    public School getX() {
        return x;
    }
    public void setX(School x) {
        this.x = x;
    }

    public void Input () {
        Scanner sc = new Scanner(System.in);
        //Truong
        System.out.println("Nhập tên trường: ");
        x.setSchoolName(sc.nextLine());
        System.out.println("Nhập ngày vào trường: ");
        x.setSchoolDate(sc.nextLine());
        //Khoa
        System.out.println("Tên khoa: " );
        facultyName = sc.nextLine();
        System.out.println("Ngày vào khoa: ");
        facultyDate = sc.nextLine();

    }

    public void Output () {
        System.out.printf("%15s %15s %15s %15s %n", x.getSchoolName(), x.getSchoolDate(), facultyName, facultyDate);
    }

}
