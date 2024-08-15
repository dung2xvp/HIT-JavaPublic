package BTVN2;

import java.util.Scanner;

public class May {
    private String MaMay;
    private String TenMay;
    private String TinhTrang;

    public May () {}

    public May (String MaMay, String TenMay, String TinhTrang) {
        this.MaMay = MaMay;
        this.TenMay = TenMay;
        this.TinhTrang = TinhTrang;
    }

    public String getMaMay() {
        return MaMay;
    }

    public void setMaMay(String maMay) {
        this.MaMay = maMay;
    }

    public String getTenMay() {
        return TenMay;
    }

    public void setTenMay(String tenMay) {
        this.TenMay = tenMay;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.TinhTrang = tinhTrang;
    }

    public void nhap () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã máy: ");
        MaMay = sc.nextLine();
        System.out.println("Nhập tên máy: ");
        TenMay = sc.nextLine();
        System.out.println("Nhập tình trạng: ");
        TinhTrang = sc.nextLine();
    }

    public void title () {
        System.out.printf("%-15s %-15s %-15s %n", "Mã máy", "Tên máy", "Tình trạng");
    }

    public void xuat () {
        System.out.printf("%-15s %-15s %-15s %n", MaMay, TenMay, TinhTrang);
    }
}
