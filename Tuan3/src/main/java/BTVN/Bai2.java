package BTVN;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        String ip;
        Scanner sc = new Scanner(System.in);
        ip = sc.nextLine();
        String rvIp = new StringBuilder(ip).reverse().toString();
        if (rvIp.equals(ip)) {
            String ipUpper = ip.toUpperCase();
            System.out.println(ipUpper);
        }
        else {
            String ipLower = ip.toLowerCase();
            System.out.println(ipLower);
        }
    }
}
