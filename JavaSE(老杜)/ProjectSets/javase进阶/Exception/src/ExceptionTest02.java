
public class ExceptionTest02 {
    public static void main(String[] args) {
        UserService u1 = new UserService();
        try
        {
            //注册方法，抛出异常。而且该异常时 编译时异常，所以需要对其进行处理。不然代码编译报错。
            //要么继续向上抛出，要么捕获异常
            u1.register("张三的的的的", "123456");
        }
        catch (MyException01 e)
        {
            System.out.println(e.getMessage());
        }
    }
}
