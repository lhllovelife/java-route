package TicketPurchase;

public class TickesSoldOutException extends Exception {
    //无参构造
    public TickesSoldOutException(){

    }
    //有参构造
    public TickesSoldOutException(String s){
        super(s);
    }
}
