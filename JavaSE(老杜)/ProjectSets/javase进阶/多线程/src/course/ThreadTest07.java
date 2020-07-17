package course;

/*
合理终止线程
 */
public class ThreadTest07 {
    public static void main(String[] args) {
        MyRunnable07 mr = new MyRunnable07();
        //创建线程对象
        Thread t = new Thread(mr);
        t.setName("t");
        t.start();

        //模拟5s
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //终止t线程
        mr.setRun(false);
    }
}

class MyRunnable07 implements Runnable{
    private boolean run = true;

    public boolean getRun() {
        return run;
    }

    public void setRun(boolean run) {
        this.run = run;
    }

    //重新run()方法
    @Override
    public void run() {
        for(int i = 1; i <= 10; i++)
        {
            if(run == true)
            {
                System.out.println(Thread.currentThread().getName() + "--> " + i);
                //睡眠1s
                try {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else
            {
                System.out.println(Thread.currentThread().getName() + "线程被终止");
                return ;
            }
        }
    }
}