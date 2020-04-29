public class Test01{
	
	static Student stu = new Student();
	public static void main(String[] args){
		stu.doSome();
		
	}
}

class Student{
	public void doSome(){
		System.out.println("已执行");
	}
}
