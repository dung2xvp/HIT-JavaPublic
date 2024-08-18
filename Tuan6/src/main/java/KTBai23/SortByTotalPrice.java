package KTBai23;

import java.util.Comparator;

public class SortByTotalPrice implements Comparator<Mobile> {
    public int compare(Mobile m1, Mobile m2) {
        if (m1.getTotalPrice() > m2.getTotalPrice()) {
            return 1;
        }
        else if (m1.getTotalPrice() < m2.getTotalPrice()) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
