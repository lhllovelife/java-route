package course;

/*
运行时异常
提供两个构造方法，一个无参，一个有参
 */
public class NoIdPropertiesException extends RuntimeException{
    public NoIdPropertiesException(){

    }
    public NoIdPropertiesException(String s){
        super(s);
    }
}
