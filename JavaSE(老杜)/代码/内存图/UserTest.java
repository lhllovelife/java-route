public class UserTest{
	public static void main(String[] args){
		User u1 = new User();
		u1.id = 110;
		u1.userName = "zhangsan";
		u1.password = "123456";
		
		System.out.println(u1.id);
		System.out.println(u1.userName);
		System.out.println(u1.password);
		
		User u2 = new User();
		u2.id = 120;
		u2.userName = "lisi";
		u2.password = "987654";
		
		System.out.println(u2.id);
		System.out.println(u2.userName);
		System.out.println(u2.password);		
		
	}
}