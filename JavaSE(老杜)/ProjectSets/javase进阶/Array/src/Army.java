//军队类
public class Army {
    //军队名称
    private  String armyName;
    //引用数据类型 武器
    private Weapon[] w;
    //无参构造
    public Army(){
        //默认数组长度为5
        w = new Weapon[5];
    }
    //有参构造
    public  Army(String armyName, int num){
        this.armyName = armyName;
        w = new Weapon[num];
    }

    //setter and getter

    public Weapon[] getW() {
        return w;
    }

    public void setW(Weapon[] w) {
        this.w = w;
    }

    //把wa武器传入到数组中
    public void addWeapon(Weapon wa){
        boolean flag = false;
        int len = 0;
        for (int i = 0; i < this.getW().length; i++)
        {
            if(this.getW()[i] == null)
            {
                flag = true;
                len = i;
                break;
            }
        }
        if(!flag) System.out.println("数组已满，无法再次加入");
        else if (flag)
        {
            this.getW()[len] = wa;
            System.out.println("武器加入成功");
        }
    }
    //让数组中所有可移动的武器攻击
    public void attackAll(){
        System.out.println("====" + this.armyName+ "发起攻击 ====");
        for(int i = 0; i < this.getW().length && this.getW()[i] != null; i++)
        {
            System.out.println("[" + this.getW()[i].getName() + "]" + " 发起攻击");
        }
    }
    //让数组中所有可移动的武器移动
    public void moveAll(){
        System.out.println("====" + this.armyName+ "武器移动 ====");
        for(int i = 0; i < this.getW().length && this.getW()[i] != null; i++)
        {
            if(this.getW()[i].getMove()) System.out.println(this.getW()[i].getName() + " 移动");
        }
    }

}
