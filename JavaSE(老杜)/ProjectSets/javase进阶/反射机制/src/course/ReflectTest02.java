package course;
import bean.JingDong;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
通过反射机制调用一个对象的方法
1. 首先获取到该类
2. 通过该类获取到该类中方法。getDeclaredMethod(String name, Class...)。通过方法名，和参数列表可唯一确定一个方法
2. 通过 java.lang.reflect.Method 中的 invoke() 方法调用 指定对象的指定方法
 */
public class ReflectTest02 {
    public static void main(String[] args) {
        //首先获取到类
        try {
            Class jdClass = Class.forName("bean.JingDong");
            //通过该类实例化一个对象
            Object obj = jdClass.newInstance();
            //获得该类的 登录 方法
            Method loginMethod = jdClass.getDeclaredMethod("login", String.class, String.class);
            Method logoutMethod = jdClass.getDeclaredMethod("logout");
            loginMethod.invoke(obj, "admin", "123");
            logoutMethod.invoke(obj);

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
        catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
