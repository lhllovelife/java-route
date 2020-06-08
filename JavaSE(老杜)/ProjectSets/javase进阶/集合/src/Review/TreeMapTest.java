package Review;

import java.util.*;

public class TreeMapTest {
    public static void main(String[] args) {
        Map<String, Customer> ma = new TreeMap<>();
        ma.put("120",new Customer("李四"));
        ma.put("110",new Customer("张三"));
        ma.put("140",new Customer("赵六"));
        ma.put("130",new Customer("王五"));
        Set<Map.Entry<String,Customer>> entrys = ma.entrySet();
        Iterator<Map.Entry<String, Customer>> it = entrys.iterator();
        while (it.hasNext())
        {
            Map.Entry<String, Customer> node = it.next();
            System.out.println(node.getKey() + "-->" + node.getValue());
        }
    }
}

class Customer{
    private String name;

    public Customer() {

    }

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(name, customer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
