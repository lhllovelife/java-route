package course;

/*
实现线程
1. 写一个类，直接继承java.lang.Thread, 实现run()方法
 */
public class ThreadTest01 {
    public static void main(String[] args) {
        //创建线程对象
        MyThread t = new MyThread();
        //开辟新的栈空间。
        t.start();
        for(int i = 0; i <= 100; i++)
        {
            System.out.println("main线程---> " + i);
        }
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        for(int i = 0; i <= 100; i++)
        {
            System.out.println("分支线程---> " + i);
        }
    }
}