package ThreadSafe;

/*
一个可运行的线程类
 */
public class AccountThread implements Runnable{

    private  Account act;

    public AccountThread(){
    }

    public AccountThread(Account act){
        this.act = act;
    }

    @Override
    public void run() {
        //取款5000元
        double money = 5000;
        act.withdraw(money);
        System.out.println(Thread.currentThread().getName() + "取款" + money + "元，余额：" + act.getBalance() + "元");
    }
}
/*
t1先取出5000，然后修改余额为5000，紧接着t2取款5000, 修改余额为0，这是t1继续执行run()后续代码，打印输出的余额就是0了。t2打印输出也是0
 */