public class StudentTest{
	public static void main(String[] args){
		// int i = 10;
		// System.out.println("i = " + i);
		// char ch = '\u0000';
		// System.out.println(ch);
		
		Student st1 = new Student();
		st1.num = 110;
		st1.name = "Tom";
		st1.age = 15;
		st1.gender = true;
		st1.address = "HeNan";
		System.out.println(st1.num);
		System.out.println(st1.name);
		System.out.println(st1.age);
		System.out.println(st1.gender);
		System.out.println(st1.address);
		
		System.out.println("-------------");
		Student st2 = new Student();
		st2.num = 120;
		st2.name = "Jerry";
		st2.age = 10;
		st2.gender = false;
		st2.address = "WuHan";		
		
		System.out.println(st2.num);
		System.out.println(st2.name);
		System.out.println(st2.age);
		System.out.println(st2.gender);
		System.out.println(st2.address);		
	
	}
}