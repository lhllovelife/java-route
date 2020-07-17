package course;

public class ThreadTest02 {
    public static void main(String[] args) {
        //创建一个可运行的类对象
        MyRunnable mr = new MyRunnable();
        //创建一个线程对象
        Thread t = new Thread(mr);
        //开辟新的栈空间
        t.start();

        //匿名类
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i <= 1000; i++)
                {
                    System.out.println("匿名类线程---> " + i);
                }
            }
        });
        t2.start();

        for(int i = 0; i <= 1000; i++)
        {
            System.out.println("main线程---> " + i);
        }

    }
}

class MyRunnable implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i <= 1000; i++)
        {
            System.out.println("分支线程---> " + i);
        }
    }
}