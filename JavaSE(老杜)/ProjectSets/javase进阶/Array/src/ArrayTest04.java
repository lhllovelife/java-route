/*模拟酒店前台管理系统*/
import java.util.Scanner;

public class ArrayTest04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Room r0 = new Room("00", "单人间", false);
        Room r1 = new Room("01", "单人间", false);
        Room r2 = new Room("02", "单人间", false);

        Room r3 = new Room("10", "双人间", false);
        Room r4 = new Room("11", "双人间", false);
        Room r5 = new Room("12", "双人间", false);

        Room r6 = new Room("20", "豪华套房", false);
        Room r7 = new Room("21", "豪华套房", false);
        Room r8 = new Room("22", "豪华套房", false);

        Room[][] rooms = new Room[3][3];
        rooms[0][0] = r0;
        rooms[0][1] = r1;
        rooms[0][2] = r2;
        rooms[1][0] = r3;
        rooms[1][1] = r4;
        rooms[1][2] = r5;
        rooms[2][0] = r6;
        rooms[2][1] = r7;
        rooms[2][2] = r8;
        Hotel h = new Hotel("假日网络宾馆", 3, 3, rooms);
        System.out.println("==== 欢迎使用《 " + h.getName() + " 》酒店管理系统 ====");
        System.out.println("指令功能如下：");
        System.out.println("       1    订房");
        System.out.println("       2    退房");
        System.out.println("       3    浏览所有房间信息");
        System.out.println("       0    退出系统");
        int ins1;
        String ins2;
        while (true)
        {
            System.out.print("请输入指令：");
            ins1 = sc.nextInt();
            if(ins1 == 1) //订房
            {
                System.out.print("请输入所想预定房间编号：");
                ins2 = sc.next(); //输入一个字符串
                h.book(ins2);

            }
            else if(ins1 == 2)//退房
            {
                System.out.print("请输入所想退订房间编号：");
                ins2 = sc.next(); //输入一个字符串
                h.checkOut(ins2);
            }
            else if(ins1 == 3) //浏览所有房间信息
            {
                h.detail();
            }
            else if(ins1 == 0)
            {
                System.out.println("成功退出系统！");
                System.exit(0);
            }
        }

    }
}
