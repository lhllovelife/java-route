package course;

/*
线程的终止
 */
public class ThreadTest06 {
    public static void main(String[] args) {
        //创建线程对象
        Thread t = new Thread(new MyRunnable06());
        t.setName("t");
        t.start();
        //模拟6s
        try {
            Thread.sleep(1000 * 6);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.stop(); //已弃用
    }
}

class MyRunnable06 implements Runnable{

    @Override
    public void run() {
        for(int i = 1; i <= 10; i++)
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
    }
}
