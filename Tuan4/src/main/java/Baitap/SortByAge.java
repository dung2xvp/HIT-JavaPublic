package Baitap;

import java.util.Comparator;

public class SortByAge implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        if (o1.getTuoi() > o2.getTuoi()) {
            return 1;
        }
        else if (o1.getTuoi() < o2.getTuoi()) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
