import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;


public class CollectionTest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Collection c = new ArrayList();
        String s1 = "abc";
        String s2 = "def";
        Integer i1 = 150;
        c.add(s1);
        c.add(s2);
        c.add(i1);
        Iterator it = c.iterator();
        while(it.hasNext())
        {
            /*
            Object obj = it.next();
            System.out.println(obj);
            c.remove(obj);
            System.out.println("集合中元素个数：" + c.size());
            it = c.iterator();
             */
            Object obj = it.next();
            System.out.println(obj);
            it.remove();
            System.out.println("集合中元素个数：" + c.size());
        }
    }
}
