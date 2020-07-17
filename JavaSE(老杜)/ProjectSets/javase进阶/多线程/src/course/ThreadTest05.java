package course;

/*
线程的睡眠 Thread.sleep()
 */
public class ThreadTest05 {
    public static void main(String[] args) {
        //创建线程对象
        Thread t = new MyThread05();
        t.setName("t");
        //启动分支线程，开辟新的栈空间
        t.start();

        //睡眠5s
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //打断t线程
        t.interrupt();
        System.out.println("main线程结束");
    }
}

class MyThread05 extends Thread{

    //重写run()方法
    public void run(){
        System.out.println(Thread.currentThread().getName() + "开始执行");
        try {
            Thread.sleep(1000 * 1000);
        } catch (InterruptedException e) {
            System.out.println("睡眠被打断");
        }
        for(int i = 1; i < 10; i++)
        {
            System.out.println(Thread.currentThread().getName() + "--> " + i);
        }
        System.out.println(Thread.currentThread().getName() + "执行结束");
    }
}
