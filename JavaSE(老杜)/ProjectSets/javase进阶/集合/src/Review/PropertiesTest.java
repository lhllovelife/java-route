package Review;

import java.util.*;

public class PropertiesTest {
    public static void main(String[] args) {
        Map ma = new Properties();
        ma.put("one", "A");
        ma.put("two", "B");
        ma.put("three", "C");
        ma.put("four", "D");
        System.out.println("集合中元素数目：" + ma.size());
        Set<Map.Entry<String, String>> entries = ma.entrySet();
        Iterator<Map.Entry<String, String>> it = entries.iterator();
        while (it.hasNext())
        {
            Map.Entry<String, String> node = it.next();
            System.out.println(node.getKey() + "-->" + node.getValue());
        }
    }
}
