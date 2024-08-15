package BTVN1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Student> dsSV = new ArrayList ();
    static Scanner ip = new Scanner(System.in);

    public static void nhap() {
        System.out.println("Nhập số lượng sinh viên: ");
        int n = ip.nextInt();
        for (int i = 0; i < n; i++) {
            Student fake = new Student();
            fake.Input();
            dsSV.add(fake);
        }
    }

    public static void inDL () {
        System.out.println("Danh sách sinh viên: ");
        System.out.printf("%15s %15s %15s %15s %15s %15s %15s %n", "Họ tên", "Lớp", "Điểm", "Trường", "Ngày vào", "Khoa", "Ngày vào");
        for (Student st : dsSV) {
            st.Output();
        }
    }

    public static void main(String[] args) {
        nhap();
        inDL();
    }
}
