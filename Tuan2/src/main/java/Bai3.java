import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        int r1 = 0, r2 = n - 1, c1 = 0, c2 = n - 1;
        int dem = 1;
        while (r1 <= r2 && c1 <= c2) {
            for (int i = c1; i <= c2; i++) {
                a[r1][i] = dem;
                ++dem;
            }
            ++r1;
            for (int i = r1; i <= r2; i++) {
                a[i][c2] = dem;
                ++dem;
            }
            --c2;
            for (int i = c2; i >= c1; i--) {
                a[r2][i] = dem;
                ++dem;
            }
            --r2;
            for (int i = r2; i >= r1; i--) {
                a[i][c1] = dem;
                ++dem;
            }
            ++c1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
