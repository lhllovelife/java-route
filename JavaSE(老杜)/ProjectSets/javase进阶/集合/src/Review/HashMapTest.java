package Review;


import java.util.*;

public class HashMapTest {
    public static void main(String[] args) {
        Map<Integer, Vip> map = new HashMap<>();
        map.put(1, new Vip(11));
        map.put(2, new Vip(15));
        map.put(3, new Vip(8));
        map.put(1, new Vip(20));
        System.out.println("key：1 ---> value：" + map.get(1));
        //遍历
        //获取所有的key为一个set集合
        Set<Integer> se = map.keySet();
        Iterator<Integer> it = se.iterator();
        while (it.hasNext())
        {
            Integer k = it.next();
            System.out.println(k + "--->" + map.get(k));
        }
        System.out.println("第二种遍历方式：");
        //遍历：Map.Entry
        //将map集合转换为为 一个元素属性为Map.Entry<,>类型的set集合
        Set<Map.Entry<Integer,Vip>> entrys = map.entrySet();
        for(Map.Entry<Integer,Vip> node : entrys)
        {
            System.out.println(node.getKey() + "--->" + node.getValue());
        }

    }

}

class Vip{
    private int no;

    public Vip() {

    }
    public Vip(int no) {
        this.no = no;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "no=" + no +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vip vip = (Vip) o;
        return no == vip.no;
    }

    @Override
    public int hashCode() {
        return Objects.hash(no);
    }
}
