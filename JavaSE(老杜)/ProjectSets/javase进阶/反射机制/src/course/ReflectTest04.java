package course;

/*
获取一个类的父类 和 所实现的接口
 */
public class ReflectTest04 {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("java.util.Date");
            Class superClass = c.getSuperclass();
            System.out.println(superClass.getSimpleName());

            System.out.println("已经实现的接口");
            Class[] interfaces = c.getInterfaces();
            for (Class inter : interfaces)
            {
                System.out.println(inter.getSimpleName());
            }
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
