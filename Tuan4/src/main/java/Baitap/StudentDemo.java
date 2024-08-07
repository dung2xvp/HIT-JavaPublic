package Baitap;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class StudentDemo {
    static ArrayList<Student> st = new ArrayList();
    static Scanner sc = new Scanner(System.in);
    //Fake data
    public static void fakeData () {
        Student st1 = new Student("Dung", "Cau Giay", 2005, 9.5, 10, 10, 2);
        st.add(st1);
        Student st2 = new Student("Duy", "Nguyen Xa", 2004, 9, 9.5, 10, 3);
        st.add(st2);
        Student st3 = new Student("Tho", "Me Tri", 2003, 9.0, 9.5, 9,5);
        st.add(st3);
        Student st4 = new Student("Quynh", "Gia Lam", 2005, 9.5, 9.5, 10, 4);
        st.add(st4);
        Student st5 = new Student("Tung", "Nguyen Xa", 2006, 8.5, 10, 9.5, 1);
        st.add(st5);
    }
    //Menu
    public static void menu () {
        System.out.println("<<<<<<<<<<<<MENU>>>>>>>>>>>");
        System.out.println("1. Them sinh vien moi");
        System.out.println("2. Sua thong tin");
        System.out.println("3. Sap xep sinh vien");
        System.out.println("4. Xoa sinh vien");
        System.out.println("5. In danh sach sinh vien");
        System.out.println("6. Thoat chuong trinh");
        System.out.print("Nhap lua chon cua ban: ");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                addSV();
            case 2:
                suaTT();
            case 3:
                sapXep();
            case 4:
                xoaSV();
            case 5:
                inDS();
            case 6:
                System.out.println("Bye bye!");
                System.exit(0);
            default:
                System.out.println("Lua chon khong hop le!");
                menu();
        }
    }
    //Them SV
    public static void addSV () {
        System.out.println("<<<<<<<<<<Them SV>>>>>>>>>>");
        Student s = new Student();
        s.nhapDL();
        st.add(s);
        System.out.println("Them sinh vien thanh cong!");
        menu();
    }
    //Sua thong tin
    public static void menuSuaTT () {
        System.out.println("<<<<<<<<<<<<  Chon thong tin can sua  >>>>>>>>>>>");
        System.out.println("1. Nam sinh");
        System.out.println("2. Dia chi");
        System.out.println("3. TX1");
        System.out.println("4. TX2");
        System.out.println("5. KTHP");
        System.out.println("6. So tiet nghi");
        System.out.println("7. Quay lai");
    }
    public static void suaTT () {
        System.out.print("Nhap ten SV can sua thong tin: ");
        String ip = sc.nextLine();
        Chon:
        for (Student std : st) {
            if (std.getName().equalsIgnoreCase(ip)) {
                menuSuaTT();
                System.out.print("Nhap lua chon cua ban: ");
                int input = sc.nextInt();
                switch (input) {
                    case 1:
                        System.out.print("Nhap nam sinh moi: ");
                        int newYob = sc.nextInt();
                        std.setYob(newYob);
                        System.out.println("Nam sinh da sua.");
                        break Chon;
                    case 2:
                        System.out.print("Nhap dia chi moi: ");
                        String newAd = sc.nextLine();
                        std.setAddress(newAd);
                        System.out.println("Dia chi da sua.");
                        break Chon;
                    case 3:
                        System.out.print("Nhap diem TX1 moi: ");
                        double newTx1 = sc.nextDouble();
                        std.setTx1(newTx1);
                        System.out.println("Diem da sua.");

                        break Chon;
                    case 4:
                        System.out.print("Nhap diem TX2 moi: ");
                        double newTx2 = sc.nextDouble();
                        std.setTx2(newTx2);
                        System.out.println("Diem da sua.");

                        break Chon;
                    case 5:
                        System.out.print("Nhap diem KTHP moi: ");
                        double newKthp = sc.nextDouble();
                        std.setKthp(newKthp);
                        System.out.println("Diem da sua.");

                        break Chon;
                    case 6:
                        System.out.print("Nhap so tiet nghi moi: ");
                        int newTN = sc.nextInt();
                        std.setTietNghi(newTN);
                        System.out.println("So tiet nghi da sua.");

                        break Chon;
                    case 7:
                        break;
                    default:
                        System.out.println("Lua chon khong hop le!");
                        break Chon;
                }
                break;
            }
            else {
                System.out.println("Khong tim thay sinh vien!");
                break;
            }
        }
        menu();
    }
    //Sap xep
    public static void menuSX() {
        System.out.println("<<<<<<<<<<<<  Chon cach sap xep  >>>>>>>>>>>");
        System.out.println("1. Theo tuoi");
        System.out.println("2. Theo GPA");
        System.out.println("3. Theo so tiet nghi");
    }
    public static void sapXep() {
        menuSX();
        System.out.println("Nhap lua chon cua ban: ");
        int sx = sc.nextInt();
        sc.nextLine();
        switch (sx) {
            case 1:
                SortByAge sba = new SortByAge();
                Collections.sort(st,sba);
                System.out.println("Danh sach da duoc sap xep.");
                break;
            case 2:
                SortByMark sbm = new SortByMark();
                Collections.sort(st,sbm);
                System.out.println("Danh sach da duoc sap xep.");
                break;
            case 3:
                SortByTN sbt = new SortByTN();
                Collections.sort(st,sbt);
                System.out.println("Danh sach da duoc sap xep.");
                break;
            default:
                System.out.println("Lua chon khong hop le!");
                menuSX();
        }
        menu();
    }
    //Xoa SV
    public static void xoaSV () {
        System.out.print("Nhap ten SV can xoa: ");
        String ten = sc.nextLine();
        for(Student std : st) {
            if (std.getName().equalsIgnoreCase(ten)) {
                st.remove(std);
                System.out.println("Da xoa sinh vien.");
                menu();
            }
        }
        System.out.println("Khong tim thay sinh vien can xoa!");
        menu();
    }
    public static void inDS() {
        System.out.println("Danh sach sinh vien: ");
        Student.printTitle();
        for (Student std : st) {
            std.inDL();
        }
        menu();
    }
    public static void main(String[] args) {
        fakeData();
        menu();
    }
}
