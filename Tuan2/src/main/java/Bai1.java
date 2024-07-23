import java.text.DecimalFormat;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        float pi = 3.14F;
        float area = pi * r * r;
        float perimeter = 2 * pi * r;
        DecimalFormat df = new DecimalFormat("##0.000");
        System.out.println(df.format(perimeter) + " " + df.format(area));
    }
}


