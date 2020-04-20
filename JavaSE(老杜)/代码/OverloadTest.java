import java.util.Scanner;
public class OverloadTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		System.out.println(sum(a,b));
	}
	/*
		方法重载：(对功能相似的方法，使用重载)
		1. 同一个类
		2. 方法名相同
		3. 参数列表不同(参数个数 参数类型 参数顺序)
		*** 和返回值类型无关 和修饰符列表无关 ***
	*/
	public static int sum(int a, int b){
		return a + b;
	}
	public static long sum(long a, long b){
		return a + b;
	}
	public static double sum(double a, double b){
		return a + b;
	}
}