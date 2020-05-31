public class Test01 {
    public static void main(String[] args) {
        B b1 = new A0();
        B b2 = new B();
        System.out.println(b1 instanceof C);
        System.out.println(b2 instanceof C);
        C c = (C)b1;


    }
}

class B{

}
interface C{

}
interface D{

}
class A0 extends B implements C{

}
class A1 extends B implements D{

}