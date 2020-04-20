public class Test02{
	public static void main(String[] args){
		Person p = new Person();
		p.age = 10;
		add(p);
		System.out.println("main-->" + p.age);
		
		String s1 = "张三";
		String s2 = s1;
		System.out.println("s1-->" + s1);
		System.out.println("s2-->" + s2);
		System.out.println(s1==s2);
		s2 = "李四"; //字符串常量池
		System.out.println("----------");
		System.out.println("s1-->" + s1);
		System.out.println("s2-->" + s2);	
		System.out.println(s1==s2);		
	}
	public static void add(Person p){
		p.age++;
		System.out.println("add-->" + p.age);
	}
}

class Person{
	int age;
}