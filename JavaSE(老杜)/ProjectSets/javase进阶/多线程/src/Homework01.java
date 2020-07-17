
/*
模拟实现“生产者-消费者”模式

 */
public class Homework01 {
    public static void main(String[] args) {
        Num n = new Num(1);
        Thread t1 = new Thread(new Odd(n), "t1");
        Thread t2 = new Thread(new Even(n), "t2");
        t1.start();
        t2.start();
    }
}

//数类
class Num{
    private int num;

    public Num() {
    }

    public Num(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
//负责输出奇数
class Odd implements Runnable{
    Num n;

    public Odd() {

    }

    public Odd(Num n) {
        this.n = n;
    }

    @Override
    public void run() {
        //一直运行，输出奇数
        while (true)
        {
            //两个线程共享的对象是 n
            synchronized (n)
            {
                //如果当前是偶数，进入等待
                if(n.getNum() % 2 == 0)
                {
                    try {
                        n.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //执行到这里说明该数是奇数，则将当前数打印输出。再将该数自加一。
                System.out.println(Thread.currentThread().getName() + "--->" + n.getNum());
                n.setNum(n.getNum()+1);
                //唤醒所有线程。
                n.notifyAll();
                //休息1s
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

//负责输出偶数
class Even implements Runnable{
    Num n;

    public Even() {
    }

    public Even(Num n) {
        this.n = n;
    }

    @Override
    public void run() {
        //一直运行输出偶数
        while (true)
        {
            //共享对象是 n
            synchronized (n)
            {
                //如果当前数字奇数，进入等待
                if (n.getNum() % 2 == 1)
                {
                    try {
                        n.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //执行到这里说明程序时偶数，打印输出即可。然后将数字自加1
                System.out.println(Thread.currentThread().getName() + "--->" + n.getNum());
                n.setNum(n.getNum() + 1);
                //唤醒处于n对象等待池中的线程。
                n.notifyAll();
                //休息1s
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}