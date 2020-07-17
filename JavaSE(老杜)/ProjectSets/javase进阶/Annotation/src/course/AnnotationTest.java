package course;

import java.lang.reflect.Field;

/*
如果该类被MyAnnotation修饰，该类需要有一个属性为“int id”.否则出现异常
 */
public class AnnotationTest {
    public static void main(String[] args) {
        try {
            Class cusClass = Class.forName("course.Customer");
            //判断该类上是否有MyAnnotation
            if (cusClass.isAnnotationPresent(MyAnnotation.class))
            {
                Field[] fields = cusClass.getDeclaredFields();
                boolean isOK = false;
                for (Field field : fields)
                {
                    //如果该类有这样一个int id 属性，则不报异常
                    String type = field.getType().getSimpleName();
                    String name = field.getName();
                    System.out.println(type + " " + name);
                    if ( "int".equals(type) && "id".equals(name)) isOK = true;
                }
                if (!isOK)
                {
                    throw new NoIdPropertiesException("该类中没有id属性");
                }
            }
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
