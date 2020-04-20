public class MethodTest{
	public static void main(String[] args){
		Me.m2();
		MethodTest.f();
		System.out.println(MethodTest.m3());
	}
	public static int f(){
		System.out.println("hahaha");
		return 0;
	}
	public static void m1(){
		System.out.println("打印m1");
	}
	public static int m3(){
		boolean flag = false;
		if(flag)
		{
			return 1;
		}
		return 2;
	}
}
class Me{
	public static void m2(){
		MethodTest.m1();
		System.out.println("打印m2");
	}	
}

/*
方法： 实现一个简单的特定功能的代码块
*/