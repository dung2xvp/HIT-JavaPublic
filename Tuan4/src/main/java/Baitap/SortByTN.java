package Baitap;

import java.util.Comparator;

public class SortByTN implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        if (o1.getTietNghi() > o2.getTietNghi()) {
            return 1;
        }
        else if (o1.getTietNghi() < o2.getTietNghi()) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
