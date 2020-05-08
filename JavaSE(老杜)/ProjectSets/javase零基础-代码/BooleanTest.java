public class BooleanTest{
	public static void main(String[] args){
		// boolean tag = false;
		// if(tag){
			// System.out.println("男");
		// }
		// else{
			// System.out.println("女");
		// }
/*		
		//编译报错
		// byte b1 = 1000;
		//直接赋值给byte,但不超过byte的范围
		byte b2 = 20; 
		//ok
		short s = 1000; 
		//ok
		int c = 1000;
		//小容量可以直接赋值给大容量，但不能超过其自身范围
		long d = c; 
		//编译错误 大容量赋值给小容量，需要强制类型转换
		// int e = d;
		//Ok
		int f = 10 / 3;
		//OK
		long g = 10;
		//编译错误
		// int h = g / 3;
		//Ok
		long m = g / 3;
		//编译错误
		// byte x = (byte)g / 3;
		//Ok
		short y = (short)(g / 3);  //3
		short i = 10; byte j = 5; 
		//编译错误
		// short k = i + j; 
		//Ok
		int n = i + j;
		//OK
		char cc = 'a';
		System.out.println("cc = " + cc); //cc = a
		System.out.println((byte)cc); //97
		int o = cc + 100; 
		System.out.println(o);//197
*/
		int c = 100;
		System.out.println(c++); //100
		int d = 100;
		System.out.println(++d);//101
		
	}
}