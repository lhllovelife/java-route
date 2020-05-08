import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(100,5);
        System.out.println("速度：" + v1.getSpeed() + " 车长：" + v1.getSize());
        v1.speedUp(10);
        System.out.println("加速后的速度：" + v1.getSpeed());
    }
}

/*交通工具类*/
class Vehicle{
//    体积和速度的私有化
    private int speed;
    private double size;
//    无参构造
    public Vehicle() {
    }
//    有参构造
    public Vehicle(int speed, double size) {
        this.speed = speed;
        this.size = size;
    }
//    setter and getter方法

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void move(){
        System.out.println("点火，启动！");
    }
    public void speedUp(int num){
        this.setSpeed(this.getSpeed() + num);
    }

    public void speedDown(int num){
        this.setSpeed(this.getSpeed() - num);
    }
}
