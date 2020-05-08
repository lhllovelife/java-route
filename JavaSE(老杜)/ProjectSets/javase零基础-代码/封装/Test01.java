public class Test01{
	public static void main(String[] args){
		Student.m1();
	}
}

class Student{
	private String name;
	private static int age = 18;
	
	public static void m1(){
		System.out.println(age);
	}
}