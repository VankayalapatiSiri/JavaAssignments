import java.util.ArrayList;
import java.util.Collections;

public class SortingByIntegers {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(4);
        l.add(3);
        l.add(7);
        l.add(5);
        l.add(8);
        System.out.println("Elements of the ArrayList before sorting : " + l);
        // using lambda expression in place of comparator object
        Collections.sort(l, (o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);
        System.out.println("Elements of the ArrayList after sorting in descending order: " + l);
        Collections.sort(l, (o1, o2) -> (o1 < o2) ? -1 : (o1 > o2) ? 1 : 0);
        System.out.println("Elements of the ArrayList after sorting in ascending order: " + l);
    }
}
