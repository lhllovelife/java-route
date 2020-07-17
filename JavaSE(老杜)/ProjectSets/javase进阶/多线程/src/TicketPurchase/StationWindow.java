package TicketPurchase;

/*
线程类：车站窗口。
//在run()方法中卖票

 */
public class StationWindow implements Runnable{
    private Customer c;
    Ticket tks;
    public StationWindow() {

    }

    public StationWindow(Customer c, Ticket tks) {
        this.c = c;
        this.tks = tks;
    }

    //购票
    @Override
    public void run() {
        try {
            tks.sale(c);
        } catch (TickesSoldOutException e) {
            System.out.println(e.getMessage());
        }
    }
}
