public class ConstructorTest01{
	public static void main(String[] args){
		Student st1 = new Student();
		System.out.println(st1.no);// Student@a09ee92
		System.out.println(st1.name);
		System.out.println(st1.age);
		Student st2 = new Student(1);
		System.out.println(st2.no);
		System.out.println(st2.name);
		System.out.println(st2.age);
	}
}