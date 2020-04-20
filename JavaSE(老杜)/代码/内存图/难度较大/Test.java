public class Test{
	public static void main(String[] args){
		Address a = new Address();
		a.city = "BeiJing";
		a.street = "CaiZai";
		a.zipCode = "469300";
		
		User u = new User();
		System.out.println(u.id);
		System.out.println(u.userName);
		System.out.println(u.addr);
		
		u.id = 110;
		u.userName = "lhl";
		u.addr = a;
		Address ad = u.addr;
		
		System.out.println(u.userName + " comes from " + u.addr.city);
		System.out.println(u.userName + " comes from " + ad.city);
	}
}