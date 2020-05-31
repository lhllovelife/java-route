import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class CollectionTest01 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        String s1 = "A";
        String s2 = "B";
        String s3 = "A";

        c.add(s1);
        c.add(s2);
        c.add(s3);
        System.out.println(c.contains(s1));
        System.out.println(c.contains(s3));
        System.out.println("集合中元素个数：" + c.size());

    }
}