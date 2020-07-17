package ThreadSafe;

/*
模拟两个线程对同一账户取款
 */
public class Test {
    public static void main(String[] args) {
        Account act = new Account("001", 10000);
        Thread t1 = new Thread(new AccountThread(act));
        Thread t2 = new Thread(new AccountThread(act));
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }
}
