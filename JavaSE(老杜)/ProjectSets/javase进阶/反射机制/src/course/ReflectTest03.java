package course;

import bean.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/*
通过反射机制调用构造方法来实例化java对象
1. 首先获取到该类
2. 接着拿到该类指定的构造方法。getDeclaredConstructor(可变长度参数列表)，获取到Constructor
3. 通过java.lang.reflect.Constructor包下的 instance(实参) 调用底层的构造方法


    public String no;
    public String name;
    public int grade;
 */
public class ReflectTest03 {
    public static void main(String[] args) {
        //首先拿到该类
        try {
            Class stClass = Class.forName("bean.Student");
            //拿到该类的构造方法
            Constructor cons = stClass.getDeclaredConstructor(String.class, String.class, int.class);
            Object st1 = cons.newInstance("110", "张三", 7);
            //访问该实例化对象st1的属性
            Field[] fields = stClass.getDeclaredFields();
            for (Field field : fields)
            {
                System.out.print(field.get(st1) + " ");
            }
            System.out.println();

            //实例化对象
            //拿到该类的构造方法
            Constructor cons2 = stClass.getDeclaredConstructor(String.class, String.class);
            Object st2 = cons2.newInstance("120", "李四");
            for (Field field : fields)
            {
                System.out.print(field.get(st2) + " ");
            }
            System.out.println();
            //实例化对象
            Constructor cons3 = stClass.getDeclaredConstructor(String.class);
            Object st3 = cons3.newInstance("130");
            for (Field field : fields)
            {
                System.out.print(field.get(st3) + " ");
            }
            System.out.println();
            //实例化对象
            Constructor cons4 = stClass.getDeclaredConstructor();
            Object st4 = cons4.newInstance();
            for (Field field : fields)
            {
                System.out.print(field.get(st4) + " ");
            }
            System.out.println();
            //直接通过Class实例化对象
            Object obj = stClass.newInstance();
            for (Field field : fields)
            {
                System.out.print(field.get(st4) + " ");
            }

        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        catch (InstantiationException e) {
            e.printStackTrace();
        }
        catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
