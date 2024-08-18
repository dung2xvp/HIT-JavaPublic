package KTBai1;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i = 0 ; i < n; i++) {
            str[i] = sc.nextLine();
        }
        for(int i = 0; i < n; i++) {
            int dem =0;
            for(int j = 0 ;j < str[i].length(); j++) {
                if(str[i].charAt(j)==' ') {
                    dem++;
                }
            }
            System.out.println(dem);
        }

    }
}