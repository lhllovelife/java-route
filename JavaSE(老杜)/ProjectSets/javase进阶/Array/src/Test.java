public class Test {
    public static void main(String[] args) {
        //创建一支军队
        Army us = new Army("美国陆军", 4);
        us.addWeapon(new ShouQiang());
        us.addWeapon(new BuQiang());
        us.addWeapon(new ZhuangJiaChe());
        us.addWeapon(new DaoDan());
        us.addWeapon(new TanKe());
        us.attackAll();
        us.moveAll();

    }
}
/*
A extends Weapon implement C

//向下转型为A类型
A a = (A)weapons[i];

（a instance C)
 */
