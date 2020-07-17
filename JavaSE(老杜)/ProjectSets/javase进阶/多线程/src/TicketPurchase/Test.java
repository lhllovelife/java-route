package TicketPurchase;

/*
测试类
 */
public class Test {
    public static void main(String[] args) {
        //定义票数为5张。
        Ticket tks = new Ticket(5);
        //定义用户
        Customer c1 = new Customer("zhangsan", "101");
        Customer c2 = new Customer("lisi", "102");
        Customer c3 = new Customer("wangwu", "103");
        Customer c4 = new Customer("zhaoliu", "104");
        Customer c5 = new Customer("jack", "105");
        Customer c6 = new Customer("rose", "106");
        Customer c7 = new Customer("tom", "107");
        //定义6个线程去抢票
        Thread t1 = new Thread(new StationWindow(c1, tks), "t1");
        Thread t2 = new Thread(new StationWindow(c2, tks), "t2");
        Thread t3 = new Thread(new StationWindow(c3, tks), "t3");
//        Thread t4 = new Thread(new StationWindow(c4, tks), "t4");
//        Thread t5 = new Thread(new StationWindow(c5, tks), "t5");
//        Thread t6 = new Thread(new StationWindow(c6, tks), "t6");
//        Thread t7 = new Thread(new StationWindow(c7, tks), "t7");
        System.out.println("------车票开始预售-------");
        t1.start();
        t2.start();
        t3.start();
/*        t4.start();
        t5.start();
        t6.start();
        t7.start();*/
        try {
            Thread.sleep(1000 * 10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tks.detail();
    }
}
