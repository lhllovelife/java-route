import java.util.*;

public class CollectionTest01 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        String s1 = "abc";
        String s2 = "def";
        String s3 = "abc";
        Integer i1 = 100;
        Integer i2 = 200;
        c.add(s1);
        c.add(s2);
        c.add(i1);
        c.add(i2);
        c.add(new Object());
        System.out.println("集合中元素个数：" + c.size()); //5
        System.out.println(c.contains(s3) ? "包含" : "不包含");//包含
        System.out.println(c.remove(s3) ? "删除成功" : "删除失败");//删除成功
        System.out.println("集合中元素个数：" + c.size()); //5
        System.out.println(c.contains(100) ? "包含" : "不包含"); //包含
        System.out.println(c.remove(s3) ? "删除成功" : "删除失败"); //删除失败
        Object arr[] = c.toArray();
        System.out.println("数组中元素个数：" + arr.length);
        Iterator it = c.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
        c.clear();
        System.out.println("集合中元素个数：" + c.size()); //0
        System.out.println("集合是否为空：" + c.isEmpty());

    }
}