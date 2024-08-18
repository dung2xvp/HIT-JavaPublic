package KTBai23;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Cau3
public class Demo {
    static ArrayList<Mobile> mb = new ArrayList(5);
    static Scanner sc = new Scanner(System.in);
    //fake data
    public static void fakeData () {
        Mobile m1 = new Mobile("D1", "Redmi 12", 3000000, 2, "Xiaomi", "6 GB");
        Mobile m2 = new Mobile("D2", "Iphone 15 PRM", 30000000, 3, "Apple", "8 GB");
        Mobile m3 = new Mobile("D3", "Iphone 13 PRM", 25000000, 2, "Apple", "6 GB");
        Mobile m4 = new Mobile("D4", "Iphone 12 PRM", 20000000, 4, "Apple", "6 GB");
        Mobile m5 = new Mobile("D5", "Iphone 8 Plus", 5000000, 1, "Apple", "4 GB");
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        mb.add(m4);
        mb.add(m5);
    }
    //In
    public static void title () {
        System.out.printf("%20s %20s %20s %20s %20s %20s %20s %n", "ID", "Name", "Price", "Total", "Manufacturer", "Ram", "Total price");
    }

    public static void inDL () {
        for(Mobile m : mb) {
            m.inTT();
        }
    }
    //SX
    public static void SX () {
        SortByTotalPrice srt = new SortByTotalPrice();
        Collections.sort(mb, srt);
    }
    //Tim kiem
    public static void findProduct () {
        System.out.println("Type product name: ");
        String ip = sc.nextLine();
        title();
        for (Mobile m : mb) {
            if (m.getName().equalsIgnoreCase(ip)) {
                m.inTT();
            }
        }
    }
    //Main
    public static void main(String[] args) {
        fakeData();
        title();
        inDL();
        SX();
        System.out.println("Product list after sorting: ");
        title();
        inDL();
        findProduct();
    }
}
