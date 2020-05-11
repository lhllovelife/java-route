//测试类
public class Homework01 {
    public static void main(String[] args) {
        InsertDrawable in1 = new Mouse();
        InsertDrawable in2 = new Keyboard();
        InsertDrawable in3 = new Screen();
        InsertDrawable in4 = new Print();
        Laptop lt1 = new Laptop("Dell", in1);
        Laptop lt2 = new Laptop("Mac",in2);
        Laptop lt3 = new Laptop("Lenovo",in3);
        Laptop lt4 = new Laptop("HUIPU",in4);

        lt1.Insert();
        lt2.Insert();
        lt3.Insert();
        lt4.Insert();
    }
}

//接口 InsertDrawable
interface InsertDrawable{
//    public abstract void connect(); /*连接的抽象方法*/
    void connect();
}

//实现者 面向接口实现

//鼠标类 (实现InsertDrawable接口)
class Mouse implements InsertDrawable{
//    实现接口中的抽象方法
    public void connect(){
        System.out.println("鼠标已连接");
    }
}

//键盘类
class Keyboard implements InsertDrawable{
//    实现接口中的抽象方法
    public void connect(){
        System.out.println("键盘已连接");
    }
}

//显示器类
class Screen implements InsertDrawable{
//    实现接口中的抽象方法
    public void connect(){
        System.out.println("显示器已连接");
    }
}

//打印机类
class Print implements InsertDrawable{
//    实现接口中的抽象方法
    public void connect(){
        System.out.println("打印机已连接");
    }
}

//笔记本电脑 接口的调用者。面向接口调用
class Laptop{
    //属性私有化
    private String name; /*电脑型号*/
    private InsertDrawable device; /*设备*/

    //无参构造
    public Laptop() {
    }

    //有参构造
    public Laptop(String name, InsertDrawable device) {
        this.name = name;
        this.device = device;
    }

    //setter and getter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InsertDrawable getDevice() {
        return device;
    }

    public void setDevice(InsertDrawable device) {
        this.device = device;
    }

    //    给电脑插上设备
//    用到多态，父类型引用指向子类型的对象
//    面向接口连接设备
    public void Insert(){
        System.out.print(this.getName() + " ");
        this.getDevice().connect();
    }
}