package BTVN2;

import java.util.Scanner;

public class QuanLy {
    private String MaQL;
    private String HoTen;

    public QuanLy () {}
    public QuanLy (String MaQL, String HoTen) {
        this.MaQL = MaQL;
        this.HoTen = HoTen;
    }

    public String getMaQL() {
        return MaQL;
    }

    public void setMaQL(String MaQL) {
        this.MaQL = MaQL;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public void nhap () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã quản lý: ");
        MaQL = sc.nextLine();
        System.out.println("Nhập tên quản lý: ");
        HoTen = sc.nextLine();
    }

    public void xuat () {
        System.out.printf("%15s %15s %n", MaQL, HoTen);
    }
}
