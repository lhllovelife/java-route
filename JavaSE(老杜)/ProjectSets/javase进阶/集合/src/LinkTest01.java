import java.util.*;

public class LinkTest01 {
    public static void main(String[] args) {
        Link l = new Link();
        Node n1 = new Node("1");
        Node n2 = new Node("2");
        Node n3 = new Node("3");
        Node n4 = new Node("4");
        l.add(n1);
        l.add(n2);
        l.add(n3);
        l.add(n4);
        System.out.println("链表中元素个数：" + l.size());
        l.travel();
        List<String> myList = new ArrayList<>();
        myList.add("A");
        myList.add("B");
        myList.add("C");
        for( String s : myList)
        {
            System.out.println(s);
        }

        Map<Integer,String > m = new HashMap<>();
        m.put(1, "A");
        m.put(2, "B");
        m.put(3, "B");
        System.out.println("获取key为3的值：" + m.get(3));
        Set<Map.Entry<Integer,String>> me = m.entrySet();
        Iterator<Map.Entry<Integer,String>> it = me.iterator();
        while (it.hasNext())
        {
            Map.Entry<Integer,String> node = it.next();
            Integer key = node.getKey();
            String value = node.getValue();
            System.out.println(key + "-->" + value);
        }

        String s = "abc";
        System.out.println("哈希值：" + s.hashCode());


    }
}
