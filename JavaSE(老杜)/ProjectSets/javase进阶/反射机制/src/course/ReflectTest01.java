package course;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/*
通过反射机制访问一个对象的属性
1. 通过属性名能确定一个Field属性
2. 不在同一个包下，反射机制只能访问public修饰的属性。其他的需要对属性进行设置，打破封装
2. 在同一个包下，反射机制能访问public protected default修饰的属性，private修饰的属性需要打破封装才能访问
    public int no;
    protected String name;
    String phoneNumber;
    private int age;

 */
public class ReflectTest01 {
    public static void main(String[] args) {
        try {
            //获取该类的Class
            Class vipClass = Class.forName("course.Vip");
            //通过反射机制实例化一个对象（调用的是无参构造）
            Object obj = vipClass.newInstance();
            //获取该类的属性
            Field field = vipClass.getDeclaredField("no");
            //public int no;
            //打印该属性的修饰符
            System.out.print(Modifier.toString(field.getModifiers()) + " ");
            //打印该属性的类型
            System.out.print(field.getType().getSimpleName() + " ");
            //打印该类的属性名
            System.out.println(field.getName());
            //将实例化对象(obj)赋值
            //no: 123  name；zhangsan phoneNumber: 400800 age: 18
            //对某对象的该属性赋值
            field.set(obj, 123);
            //取出某对象该属性的值
            System.out.println(field.get(obj));

            //protected String name;
            Field nameFiled = vipClass.getDeclaredField("name");
//            nameFiled.setAccessible(true);
            System.out.print(Modifier.toString(nameFiled.getModifiers()) + " ");
            System.out.print(nameFiled.getType().getSimpleName() + " ");
            System.out.println(nameFiled.getName());
            nameFiled.set(obj, "zhangsan");
            System.out.println(nameFiled.get(obj));

            //String phoneNumber;
            Field pnFiled = vipClass.getDeclaredField("phoneNumber");
            pnFiled.setAccessible(true);
            System.out.print(Modifier.toString(pnFiled.getModifiers()));
            System.out.print(pnFiled.getType().getSimpleName() + " ");
            System.out.println(pnFiled.getName());
            pnFiled.set(obj, "400800");
            System.out.println(pnFiled.get(obj));

            //private int age;
            Field ageField = vipClass.getDeclaredField("age");
//            ageField.setAccessible(true);
            System.out.print(Modifier.toString(ageField.getModifiers()) + " ");
            System.out.print(ageField.getType().getSimpleName() + " ");
            System.out.println(ageField.getName());
            ageField.set(obj, 18);
            System.out.println(ageField.get(obj));
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        catch (InstantiationException e) {
            e.printStackTrace();
        }
        catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

    }
}
