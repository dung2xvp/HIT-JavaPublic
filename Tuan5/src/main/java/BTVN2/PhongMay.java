package BTVN2;

import java.util.ArrayList;
import java.util.Scanner;

public class PhongMay {
    private String MaPhong;
    private String TenPhong;
    private double DienTich;
    QuanLy x = new QuanLy();
    ArrayList<May> y = new ArrayList();
    int n;

    public PhongMay () {}

    public PhongMay(String maPhong, String tenPhong, double dienTich, QuanLy x, int n, ArrayList<May> y) {
        this.MaPhong = maPhong;
        this.TenPhong = tenPhong;
        this.DienTich = dienTich;
        this.x = x;
        this.n = n;
        this.y = y;
    }

    public String getMaPhong() {
        return MaPhong;
    }
    public void setMaPhong(String maPhong) {
        MaPhong = maPhong;
    }

    public String getTenPhong() {
        return TenPhong;
    }
    public void setTenPhong(String tenPhong) {
        TenPhong = tenPhong;
    }

    public double getDienTich() {
        return DienTich;
    }
    public void setDienTich(double dienTich) {
        DienTich = dienTich;
    }

    public QuanLy getX() {
        return x;
    }
    public void setX(QuanLy x) {
        this.x = x;
    }

    public int getN() {
        return n;
    }
    public void setN(int n) {
        this.n = n;
    }

    public ArrayList<May> getY() {
        return y;
    }
    public void setY(ArrayList<May> y) {
        this.y = y;
    }

    public void nhap () {
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhập mã phòng: ");
        MaPhong = sc.nextLine();
        System.out.println("Nhập tên phòng: ");
        TenPhong = sc.nextLine();
        System.out.println("Nhập diện tích phòng: ");
        DienTich = sc.nextDouble();
        x.nhap();
        System.out.println("Nhập số lượng máy: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Nhập thông tin máy thứ " + i + ":");
            May fake = new May();
            fake.nhap();
            y.add(fake);
        }
    }

    public void xuat () {
        System.out.printf("%15s %15s %15.1f %15d", MaPhong, TenPhong, DienTich, n);
        x.xuat();
        May s = new May();
        s.title();
        for(May may : y) {
            may.xuat();
        }
    }
}
