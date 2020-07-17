package TicketPurchase;

/*
卖票的接口
//抽象方法
 */
public interface saleTicket {
    public abstract void sale(Customer c) throws TickesSoldOutException;
}
