package BTVN1;

import java.util.Scanner;

public class Student {
    private String Name;
    private String Class;
    private double Score;
    Faculty y = new Faculty();

    public Student() {}
    public Student(String Name, String Class, double Score, Faculty y) {
        this.Name = Name;
        this.Class = Class;
        this.Score = Score;
        this.y = y;
    }

    public String getName() {
        return Name;
    }
    public void setName(String name) {
        this.Name = name;
    }

    public String getCLass() {
        return Class;
    }
    public void setCLass(String Class) {
        this.Class = Class;
    }

    public double getScore() {
        return Score;
    }
    public void setScore(double Score) {
        this.Score = Score;
    }

    public Faculty getY() {
        return y;
    }
    public void setY(Faculty y) {
        this.y = y;
    }

    public void Input () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên: ");
        Name = sc.nextLine();
        System.out.println("Nhập lớp: ");
        Class = sc.nextLine();
        System.out.println("Nhập điểm: ");
        Score = sc.nextDouble();
        y.Input();
    }
    public void Output () {
        System.out.printf("%15s %15s %15.2f", Name, Class, Score);
        y.Output();
    }
}
