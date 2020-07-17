package course;

/*回顾：创建线程的第一种方法。
    编写一个直接继承java.lang.Thread, 重写run()方法。这就是一个线程类。
 */
public class ThreadTest03 {
    public static void main(String[] args) {
        //创建一个线程对象
        MyTHread03 t = new MyTHread03();
        //启动线程。start()方法启动分支线程，开辟一个新的栈空间。
        t.start();

        for(int i = 0; i < 1000; i++)
        {
            System.out.println("main线程--> " + i);
        }
    }
}

class MyTHread03 extends Thread{
    @Override
    public void run() {
        for(int i = 0; i < 1000; i++)
        {
            System.out.println("分支线程--> " + i);
        }
    }
}