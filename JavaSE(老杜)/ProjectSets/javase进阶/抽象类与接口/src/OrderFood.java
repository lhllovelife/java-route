
public class OrderFood {
    public static void main(String[] args) {
        FoodMenu fmC = new ChineseCooker();
        FoodMenu fmA = new AmericanCooker();
        Customer c1 = new Customer("张三",fmC);
        c1.order();
        Customer c2 = new Customer("李四",fmA);
        c2.order();
    }
}

/*接口：菜单*/
interface FoodMenu{
    public abstract void Noodles(); /*抽象方法*/
    public abstract void Beef();
}

//厨师,接口的实现者

//中国厨师
class ChineseCooker implements FoodMenu{
    //实现方法，实现接口里的方法
    public void Noodles(){
        System.out.println("中国厨师： 兰州拉面");
    }
    public void Beef(){
        System.out.println("中国厨师： 红烧牛肉");
    }
}
//美国厨师
class AmericanCooker implements FoodMenu{
    //实现接口中的方法(也叫方法重写，方法覆盖，常说实现)
    public void Noodles(){
        System.out.println("美国厨师： 意大利面");
    }
    public void Beef(){
        System.out.println("美国厨师： 牛排");
    }

}

//顾客 接口的调用者。面向接口调用
//"顾客"类
class Customer{
//    属性私有化
    private String name; /*顾客名字*/
    private FoodMenu fm; /*顾客手里有一份菜单*/

    //无参构造
    public Customer(){

    }
    //有参构造
    public Customer(String name, FoodMenu fm){
        this.name = name;
        this.fm = fm;
    }
    //setter and getter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FoodMenu getFm() {
        return fm;
    }

    public void setFm(FoodMenu fm) {
        this.fm = fm;
    }

    //点菜方法 (面向菜单点菜)
    public void order(){
        System.out.println(this.getName() + "所点菜品：");
        this.getFm().Noodles(); /*点菜单中的 面条，厨师去做*/
        this.getFm().Beef(); /*点菜单中的牛肉， 厨师去做*/
    }
}