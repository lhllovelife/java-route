public class Test03{
	public static void main(String[] args){
		Student st1 = new Student();
		Student st2 = new Student();
		st1.num = 10;
		st2 = st1;
		System.out.println("st1.num-->" + st1.num);
		System.out.println("st2.num-->" + st2.num);
		System.out.println(st1==st2);
		st2.num = 11;
		System.out.println("st1.num-->" + st1.num);
		System.out.println("st2.num-->" + st2.num);		
		System.out.println(st1==st2);
	}
}
class Student{
	int num;
}