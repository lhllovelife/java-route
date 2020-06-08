package Review;

import java.util.*;

public class LinkedListTest {
    public static void main(String[] args) {
        List<Integer> l = new LinkedList<>();
        l.add(100);
        l.add(200);
        l.add(50);
        l.add(500);
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
        Iterator<Integer> it = l.iterator();
        while (it.hasNext())
        {
            int retVal = it.next();
            System.out.println(retVal);
        }
        l.remove(3);
        System.out.println("删除下标为3的元素");
        //foreach
        for (Integer s : l)
        {
            System.out.println(s);
        }

        List<User> l2 = new LinkedList<>();
        l2.add(new User(25));
        l2.add(new User(18));
        l2.add(new User(17));
        l2.add(new User(30));
        Collections.sort(l2);
        System.out.println("经过排序后的User对象");
        Iterator<User> it2 = l2.iterator();
//        l2.remove(1);
        while (it2.hasNext())
        {
            System.out.println(it2.next());
//            it2.remove();
        }
        System.out.println(l2.size());
        System.out.println("User对象集合是否为空：" + l2.isEmpty());
        System.out.println("是否包含：" + l2.contains(new User(25)) );

    }
}

class User implements Comparable<User>{
    private int age;
    public User(){

    }
    public User(int age){
        this.age = age;
    }
    public String toString(){
        return "年龄：" + this.age;
    }

    @Override
    public int compareTo(User o) {
        return this.age - o.age;
    }
    //重写equals方法

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }
}
