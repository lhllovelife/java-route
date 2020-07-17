package TicketPurchase;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
车票类
实现卖票的方法
 */
public class Ticket implements saleTicket{
    private List<Customer> tickets = new LinkedList<>();
    private int num;
    private int remain;

    public Ticket() {
    }

    public Ticket(int num) {
        this.num = num;
        this.remain = num;
    }

    public List<Customer> getTickets() {
        return tickets;
    }

    public void setTickets(List<Customer> tickets) {
        this.tickets = tickets;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getRemain() {
        return remain;
    }

    public void setRemain(int remain) {
        this.remain = remain;
    }

    //实现卖票的方法
    //设定该票一共有num张
    //如果当前票未售空(数组大小 < num), 则售出一张票
    //如果票已售空，则抛出票售空异常。
    @Override
    public void sale(Customer c) throws TickesSoldOutException {
        //票对象是共享对象
        synchronized (this){
            if(this.getRemain() > 0)
            {
                //有剩余票，则将票售出
                tickets.add(c);
                System.out.println(c.getName() + "订购成功，祝您旅途愉快！");
                //修改剩余票数
                this.setRemain(this.getRemain() - 1);
            }
            else
            {
                //票售空，抛出异常信息。
                throw new TickesSoldOutException("票已售空");
            }
            System.out.println(Thread.currentThread().getName() + " 休息1s");
            //停顿1s
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //打印售票情况信息。
    public void detail(){
        System.out.println();
        System.out.println("|===售票信息===|");
        System.out.println("|共有票数：" + this.num + "张 |");
        System.out.println("|已售出：  " + (this.num - this.remain) + "张 |");
        System.out.println("|剩余票数：" + this.remain + "张 |");
        System.out.println("|=============|");
        System.out.println();
        System.out.println("----已经购买到票的人员信息：----");
        //使用迭代器遍历
        Iterator<Customer> it = tickets.iterator();
        Customer cu;
        while (it.hasNext())
        {
            cu = it.next();
            System.out.println("姓名：" + cu.getName() + "  " + "身份证号：" + cu.getIdCard());
        }
        System.out.println("----打印信息完毕！----");

    }
}
