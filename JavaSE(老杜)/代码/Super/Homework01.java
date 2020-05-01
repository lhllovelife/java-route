import java.util.Scanner;

public class Homework01{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		A a = new A(80);
		B b = new B(a);
		int num;
		while(true)
		{
			num = sc.nextInt();
			b.guess(num);
		}
		// A a = new A(16);
		// int x;
		// while(true)
		// {
			// x = sc.nextInt();
			// if(x > a.getV())
			// {
				// System.out.println("大了");
			// }
			// else if(x < a.getV())
			// {
				// System.out.println("小了");
			// }
			// else
			// {
				// System.out.println("猜测成功");
				// break;
			// }
		// }
	}
}
class A{
	private int v;
	
	public A(){
		
	}
	public A(int v){
		this.v = v;
	}
	
	public void setV(int v){
		this.v = v;
	}
	public int getV(){
		return this.v;
	}
}

class B{
	private A a; //将A 设置为一个属性。
	public B(){
		
	}
	public B(A a){
		this.a = a;
	}
	public void setA(A a){
		this.a = a;
	}
	public A getA(){
		return this.a;
	}
	
	public void guess(int num)
		// int x = this.getA().getV();
		System.out.println(x);
		if(num>x)
		{
			System.out.println("猜大了");
			
		}
		else if(num<x)
		{
			System.out.println("猜小了");
		}
		else 
		{
			System.out.println("猜测成功");
			System.exit(0);
		}
	}
}