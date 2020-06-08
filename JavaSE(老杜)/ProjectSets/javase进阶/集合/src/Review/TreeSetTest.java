package Review;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        Set<Integer> se = new TreeSet<>();
        se.add(150);
        se.add(180);
        se.add(10);
        se.add(50);
        Iterator<Integer> it = se.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
        for (Integer i : se)
        {
            System.out.println(i);
        }
    }
}
