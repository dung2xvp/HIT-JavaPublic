package BTVN;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        final String hinhVuong = "Square";
        final String hinhTamGiac = "Triangle";
        final String hinhTron = "Circle";
        String type;
        Scanner sc = new Scanner(System.in);
        type = sc.nextLine();
        if (type.equals(hinhVuong)) {
            double a = sc.nextDouble();
            System.out.printf("%.2f %n", Math.pow(a, 2));
        }
        else if (type.equals(hinhTamGiac)) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            if (a + b < c || a + c < b || b + c < a) {
                System.out.println(-1);
            }
            if (a + b >= c && a + c >= b && b + c >= a) {
                double p = (a + b + c) / 2;
                System.out.printf("%.2f %n", Math.sqrt(p * (p - a) * (p - b) * (p - c)));
            }
        }
        else if (type.equals(hinhTron)) {
            double r = sc.nextDouble();
            System.out.printf("%.2f %n", Math.PI * Math.pow(r, 2));
        }
        else {
            System.out.println("Hinh dang khong hop le!");
        }
    }
}
