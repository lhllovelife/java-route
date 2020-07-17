package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//只能出现在类上
@Target(ElementType.TYPE)
//保持性策略，出现在字节码文件中，且能被反射机制所读取
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    //注解中的属性
    String username();
    String password();
    int money() default 100;
}
