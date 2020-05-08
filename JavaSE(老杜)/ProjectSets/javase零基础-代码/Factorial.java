import java.util.Scanner;

public class Factorial{
	public static void main(String[] args6){
		Scanner sc = new Scanner(System.in);
		// System.out.print("请输入一个整数：");
		// int num, result;
		// num = sc.nextInt();
		// result = fac(num);
		// System.out.println(num + "的阶乘为：" + result);
		
		int m;
		m = sc.nextInt();
		System.out.println(Math.pow(m, 0.5));
	}
	public static int fac(int n){
		if(n==0 || n==1)
			return 1;
		return n * fac(n-1);
	}
}