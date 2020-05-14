//模拟栈数据结构
import java.util.Scanner;

public class ArrayTest03 {
    public static void main(String[] args) {
        MyStack ms = new MyStack();
        ms.push(1);
        ms.push(2);
        ms.push(3);
        ms.push(4);
        ms.push(5);
        //已经存入5个数据，栈已经满
        ms.push(6); //栈满，存不进去
//        int x = ms.top();
        System.out.println(ms.top());
        ms.pop(); //弹出栈顶元素 5
        ms.pop(); //弹出栈顶元素 4
        System.out.println(ms.top()); //当前栈顶元素是3
        ms.pop();//删除3
        System.out.println(ms.top()); //当前栈顶元素是 2
        ms.pop(); //删除2
//        ms.pop(); //删除1
        System.out.println(ms.top()); //当前栈顶元素为1
        System.out.println("-----------------------------");
        Student st1 = new Student("110", "张三");
        Student st2 = new Student("120", "李四");
        Student st3 = new Student("130", "王五");
        Student st4 = new Student("140", "赵六");
        Student st5 = new Student("150", "刘备");
        MyStack mst = new MyStack(4);
        mst.push(st1); //存入st1
        mst.push(st2); //存入st2
        mst.push(st3); //存入st3
        mst.push(st4); //存入st4
        mst.push(st5); //存入st5 栈已满，存不进去
        mst.pop(); //删除st4
        mst.pop(); //删除st3
        mst.pop(); //删除st2
        mst.pop(); //删除st1
        Student st0 = (Student)mst.top();
        System.out.println("学号：" + st0.getNo() + " " + "姓名：" + st0.getName());




    }
}

//栈类
class MyStack{
    //属性私有化
    private int num; /*栈的大小*/
    private int index; /*栈帧（栈顶）*/
    private Object[] objs; /*存储数据*/
    //无参构造
    public MyStack(){
        this.num = 5;  /*默认情况栈大小为5*/
        this.index = 0; /*默认栈帧指向最底部*/
        this.objs = new Object[10]; /*默认创建可容纳10个数据的一个数组*/
    }
    public MyStack(int num){
        this.num = num;
        this.index = 0;
        this.objs = new Object[num]; /*创建一个可容纳num个数据的数组*/
    }

    //setter and getter

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Object[] getObjs() {
        return objs;
    }

    public void setObjs(Object[] objs) {
        this.objs = objs;
    }

    //压栈 push. 传进一个参数
    public void push(Object obj){
        //存入数据前，判断栈是否满
        if(this.index == this.num ){
            System.out.println("当前栈已满，该元素未能存进去");
            return ;
        }
        //栈未满，压入栈，栈帧+1
        objs[this.index] = obj;
        this.index++;
    }
    //弹栈 pop
    public void pop(){
        //弹栈前，先检查栈是否为空
        if(this.index == 0){
            System.out.println("当前栈已空");
            return ;
        }
        // 栈帧-1，将数组中顶部元素赋值为null
        this.index--;
        objs[this.index] = null;
    }

    //获取栈顶元素
    public Object top(){
        //获取前，检查该栈是否为空
        if(this.index == 0)
        {
            System.out.println("该栈为空");
//            System.exit(0); //栈为空的时候
            return null;
        }
        return objs[this.index-1];
    }
}

