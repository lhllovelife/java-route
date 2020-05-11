public class FinalizeTest01 {
    public static void main(String[] args) {
        for(int i = 0; i <= 100; i++)
        {
            Person p = new Person();
            p = null;
            System.gc();
        }

    }
}

class Person{
//    protected void finalize() throws Throwable{
//        System.out.println("即将被回收");
//    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(this + "即将被销毁");
    }
}