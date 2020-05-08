import java.util.Scanner;

public class fx{
	// static int m = 5;
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		// int a = 100, b = 200;
		// int c = a + b;
		// System.out.println(a + "+" + b + "=" + c);
		int a = sc.nextInt(), b = sc.nextInt();
		fx.sumInt(a,b);
	}
	//类体里面才能调用方法
	//形参的变量是 局部变量
	//方法调用结束，局部变量自动释放。x y z为局部变量。
	//调用方法：类名.方法名
	//跨类调用 类名. 不能省略
	//同一个类中可以省略
	public static void sumInt(int x, int y){
		int z = x + y;
		System.out.println(x + "+" + y + "=" + z);
	}
	public static int divide(int x, int y){
		int z = x / y;
		return z;
	}
	
}