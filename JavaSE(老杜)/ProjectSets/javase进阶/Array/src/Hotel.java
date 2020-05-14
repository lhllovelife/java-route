//酒店类
public class Hotel {
    private String name; /*酒店名字*/
    private Room[][] rooms; /*房间。数据类型为二维数组*/
    private int x; //行
    private int y; //列

    //构造方法
    public Hotel(){
        //默认情况下，酒店名字为"同福客栈"。为两层，每层3间。即2行3列；
        /*
            房间编号：
                     00 01 02 03 04
                     10 11 12 13 14
        */
        this.name = "同福客栈";
        this.rooms = new Room[2][3]; //定义一个2行3列的数组。
    }
    public Hotel(String name, int x, int y, Room[][] rooms){
        this.name = name;
        this.x = x;
        this.y = y;
        this.rooms = rooms;
    }
    //setter and getter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //前台预定房间，根据房间编号 s = "00"
    public void book(String s){
        //先检测该房间的转态
        char r = s.charAt(0);
        char c = s.charAt(1);
        r -= '0'; //行
        c -= '0'; //列
        boolean flag = rooms[r][c].isStatus();
        if(flag)
        {
            System.out.println("该房间已被预定，请您挑选其他房间");
            return ;
        }
        rooms[r][c].setStatus(true); /*将该房间属性改为True*/
        System.out.println("---预定成功！ 您的房间编号号是：" + s + "  房间类型："+ rooms[r][c].getType() + " ---") ;
    }

    //退房
    public void checkOut(String s){
        //先检测该房间的转态
        char r = s.charAt(0);
        char c = s.charAt(1);
        r -= '0'; //行
        c -= '0'; //列
        boolean flag = rooms[r][c].isStatus();
        if(!flag) //该房间当前转态不是在预定中。则不可以退订
        {
            System.out.println("该房间是空房，不能进行退房操作");
            return ;
        }
        rooms[r][c].setStatus(false); /*将房间的状态改为false*/
        System.out.println("---退房成功，欢迎下次光临---");
    }
    //输出当前所有房间的转态
    public void detail(){
        System.out.println("======   房间信息一览   ======");
        int r = this.x;
        int c = this.y;
        for(int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                System.out.print("房间编号：" + rooms[i][j].getId() + "    |    ");
                System.out.print("房间类型：" + rooms[i][j].getType() + "    |    ");
                String sta = rooms[i][j].isStatus() ? "已预订" : "空房";
                System.out.print("房间状态：" + sta + "    |    ");
                System.out.println();

            }
        }
    }

}
