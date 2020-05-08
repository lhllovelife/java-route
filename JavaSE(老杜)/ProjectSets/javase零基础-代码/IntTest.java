public class IntTest{
	public static void main(String[] args){
		int a = 100;
		System.out.println(a);
		
		long b = 20000000001L; //小容量自动转换为大容量, 自动类型转换.但是超出int,报错：整数太大
		System.out.println(b);
		
		int c = (int)2000000L; //大容量转为小容量，需要强制类型转换。不强制转换会出现：类型不兼容
		System.out.println(c);
		
		byte d = 2; //byte和short 不超过其范围时赋值，不需要强制类型转换。超出其范围的时候出现：类型不兼容。
		System.out.println(d);
		
		short s = 32767;
		System.out.println(s);
	}
}