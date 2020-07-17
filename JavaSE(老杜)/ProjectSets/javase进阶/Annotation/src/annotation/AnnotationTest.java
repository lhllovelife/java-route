package annotation;

import java.lang.annotation.Annotation;
/*
通过反射机制获取注解，以及访问该注解对象上的属性
1. 先获取该类，判断该类上是否有某注解。如果有，则拿到该注解对象，访问该注解对象的属性
 */
public class AnnotationTest {
    public static void main(String[] args) {
        try {
            Class userClass = Class.forName("annotation.User");
            //判断该类上是否有注解
            if(userClass.isAnnotationPresent(MyAnnotation.class))
            {
                //默认返回值类型为注解类型(Annotation), 获取该注解对象，通过该类获取该注解对象
                MyAnnotation anno = (MyAnnotation) userClass.getAnnotation(MyAnnotation.class);
                System.out.println("类上面的注解对象：" + anno);
                //已经有了注解对象，访问该注解对象的属性
                System.out.println(anno.username());
                System.out.println(anno.password());
                System.out.println(anno.money());
                System.out.println(anno.annotationType().getSimpleName());


            }
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
