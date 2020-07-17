package annotation2;

import java.lang.reflect.Method;

public class MyAnnotationTest {
    public static void main(String[] args) {

        try {
            //首先获取类
            Class userClass = Class.forName("annotation2.User");
            //获取到doSome方法
            Method doSomeMethod = userClass.getDeclaredMethod("doSome");
            //判断该方法上是否有该注解
            if(doSomeMethod.isAnnotationPresent(MyAnnotation.class))
            {
                //如果有，则拿到该注解对象
                MyAnnotation anno = doSomeMethod.getAnnotation(MyAnnotation.class);
                System.out.println(anno.username());
                System.out.println(anno.password());
            }

        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
