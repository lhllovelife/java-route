package course;

/*
温习第二种创建线程的方法
    1. 定义一个可运行的类，实现Runnable()接口
 */
public class ThreadTest04 {
    public static void main(String[] args) {
        //创建一个可运行的对象
        MyRunnable04 mr = new MyRunnable04();
        //创建一个线程对象
        Thread t = new Thread(mr);
        //启动分支线程，开启新的栈空间
        t.start();
        for(int i = 0; i < 1000; i++)
        {
            System.out.println("main线程--> " + i);
        }
    }
}

class MyRunnable04 implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 1000; i++)
        {
            System.out.println("分支线程--> " + i);
        }
    }
}


