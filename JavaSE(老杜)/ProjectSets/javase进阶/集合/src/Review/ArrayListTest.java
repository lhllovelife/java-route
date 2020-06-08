package Review;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
/*
1. 创建对象
2. 添加元素
3. 取出元素
4. 遍历集合

 */
public class ArrayListTest {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("zhagnsan");
        l.add("lisi");
        l.add("wangwu");
        l.add("zhaoliu");
        System.out.println("集合中元素数目"+ l.size());
        System.out.println("下标为2的元素是: " + l.get(2));
        //遍历集合
        for (int i = 0; i < l.size(); i++)
        {
            System.out.println("第" + i + "个元素：" + l.get(i));
        }
        //集合工具类 对List进行排序
        Collections.sort(l);
        System.out.println("排序之后的遍历");
        //迭代器遍历
        Iterator<String> it = l.iterator();
        while (it.hasNext())
        {
            String retVal = it.next();
            System.out.println(retVal);
        }
        l.remove(3);
        System.out.println("删除下标为3的元素");
        //foreach
        for (String s : l)
        {
            System.out.println(s);
        }
    }
}
