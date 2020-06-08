package Review;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        Set<Animal> se = new HashSet<>();
        se.add(new Animal("cat"));
        se.add(new Animal("dog"));
        se.add(new Animal("bird"));
        se.add(new Animal("cat"));
        System.out.println("集合中元素的数目");
        System.out.println(se.size());
        //遍历集合
        Iterator<Animal> it = se.iterator();
        while (it.hasNext())
        {
            Animal a = it.next();
            System.out.println(a);
        }
        boolean b1 = se.contains(new Animal("bird"));
        boolean b2 = se.contains(new Animal("panda"));
        System.out.println("是否已经包含 bird: " + b1);
        System.out.println("是否已经包含 panda: " + b2);
    }
}

class Animal{
    private String name;

    public Animal(){

    }
    public Animal(String name) {
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
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
