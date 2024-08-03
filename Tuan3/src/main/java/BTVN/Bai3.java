package BTVN;

import java.util.Random;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Random rand = new Random();
        a = rand.nextInt(11);
        b = rand.nextInt(11);
        c = rand.nextInt(21);
        boolean per = Math.random() < 0.51;
        if (!per) {
            c = a + b;
        }
        System.out.println(a + " + " + b + " = " + c);
        Scanner ip = new Scanner(System.in);
        System.out.print("Phep tinh tren dung hay sai(Y/N): ");
        String answer = ip.nextLine();
        if (answer.equalsIgnoreCase("Y")) {
            if (a + b == c) {
                System.out.println("Chinh xac!");
            }
            else {
                System.out.println("Sai!");
            }
        }
        else if (answer.equalsIgnoreCase("N")) {
            if (a + b == c) {
                System.out.println("Sai!");
            }
            else {
                System.out.println("Chinh xac!");
            }
        }
        else {
            System.out.println("Nhap sai!");
        }
    }

}
