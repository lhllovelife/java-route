import java.util.ArrayList;
import java.util.List;

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
        
    }
}
