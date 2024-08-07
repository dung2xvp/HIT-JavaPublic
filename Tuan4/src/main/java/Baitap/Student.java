package Baitap;

import java.util.Calendar;
import java.util.Scanner;

public class Student {
    private String name;
    private String address;
    private int yob;
    private double tx1, tx2, kthp;
    private int tietNghi;
    Calendar cl = Calendar.getInstance();
    int year = cl.get(Calendar.YEAR);
    //Constructor
    public Student() {}

    public Student(String name, String address, int yob, double tx1, double tx2, double kthp, int tietNghi) {
        this.name = name;
        this.address = address;
        this.yob = yob;
        this.tx1 = tx1;
        this.tx2 = tx2;
        this.kthp = kthp;
        this.tietNghi = tietNghi;
    }
    //Getter & Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public int getYob() {
        return yob;
    }
    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getTx1() {
        return tx1;
    }
    public void setTx1(double tx1) {
        this.tx1 = tx1;
    }

    public double getTx2() {
        return tx2;
    }
    public void setTx2(double tx2) {
        this.tx2 = tx2;
    }

    public double getKthp() {
        return kthp;
    }
    public void setKthp(double kthp) {
        this.kthp = kthp;
    }

    public int getTietNghi() {
        return tietNghi;
    }
    public void setTietNghi(int tietNghi) {
        this.tietNghi = tietNghi;
    }
    //Tinh tuoi + GPA
    public int getTuoi () {
        return year - getYob();
    }
    public double getGPA () {
        return tx1 * 0.2 + tx2 * 0.3 + kthp * 0.5;
    }
    //Methods
    public void nhapDL () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin sinh vien: ");
        System.out.print("Nhap ten SV: ");
        name = sc.nextLine();
        System.out.print("Nhap nam sinh: ");
        yob = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap dia chi: ");
        address = sc.nextLine();
        System.out.print("TX1: ");
        tx1 = sc.nextDouble();
        System.out.print("TX2: ");
        tx2 = sc.nextDouble();
        System.out.print("KTHP: ");
        kthp = sc.nextDouble();
        System.out.print("So tiet nghi: ");
        tietNghi = sc.nextInt();
    }
    public static void printTitle () {
        System.out.printf("%20s %15s %15s %15s %15s %15s %15s %n","Ten", "Tuoi", "TX1", "TX2", "KTHP", "GPA", "So tiet nghi");
    }
    public void inDL () {
        System.out.printf("%20s %15d %15.2f %15.2f %15.2f %15.2f %15d %n", name, getTuoi(), tx1, tx2, kthp, getGPA(), tietNghi);
    }
    public String toString () {
        return "";
    }
}

