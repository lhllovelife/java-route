//武器类
public class Weapon {
    private String name;
    private boolean move;

    public Weapon() {
    }
    //setter and getter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getMove() {
        return move;
    }

    public void setMove(boolean move) {
        this.move = move;
    }
}

//手枪
class ShouQiang extends Weapon{

    //无参构造
    public ShouQiang(){
        this.setName("手枪");
        this.setMove(false);
    }
}
//步枪
class BuQiang extends Weapon{
    public BuQiang() {
        this.setName("步枪");
        this.setMove(false);
    }
}
//冲锋枪
class ChongFengQiang extends Weapon{
    public ChongFengQiang() {
        this.setName("冲锋枪");
        this.setMove(false);
    }
}
//导弹
class DaoDan extends Weapon{
    public DaoDan() {
        this.setName("导弹");
        this.setMove(true);
    }
}
//坦克
class TanKe extends Weapon{
    public TanKe() {
        this.setName("坦克");
        this.setMove(true);
    }
}
//装甲车
class ZhuangJiaChe extends Weapon{
    public ZhuangJiaChe() {
        this.setName("装甲车");
        this.setMove(true);
    }
}