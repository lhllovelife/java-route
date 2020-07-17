package course;

/*
A类继承的这个类，实现了接口中的类
 */
public class Test01 {
    public static void main(String[] args) {

    }
}

interface in{
    public abstract void doA();
    public abstract void doB();
}

class A implements in{

    @Override
    public void doA() {
        System.out.println("A类重写A方法");
    }

    @Override
    public void doB() {
        System.out.println("A类重写A方法");
    }
}

class B extends A implements in{

}
