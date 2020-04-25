public class Last{
	public static void main(String[] args){
		Husband x = new Husband("9527", "小明", "1995-06-22");
		Wife y = new Wife("6502", "小红", "2005-05-03");
		x.w = y;
		y.h = x;
		System.out.println("-----丈夫--------");
		System.out.println("身份证号：" + x.number);
		System.out.println("姓名：" + x.name);
		System.out.println("出生日期：" + x.birth);
		System.out.println("妻子姓名：" + x.w.name);
		System.out.println("-----妻子--------");
		System.out.println("身份证号：" + y.number);
		System.out.println("姓名：" + y.name);
		System.out.println("出生日期：" + y.birth);
		System.out.println("丈夫姓名：" + y.h.name);		
		
	}
}

class Husband{
	String number;
	String name;
	String birth;
	Wife w;
	//构造方法
	public Husband(){
		
	}
	public Husband(String u, String v, String w){
		number = u;
		name = v;
		birth = w;
	}
	public Husband(Wife a){
		w = a;
	}
}

class Wife{
	String number;
	String name;
	String birth;
	Husband h;	
	//构造方法
	public Wife(){
		
	}
	public Wife(String u, String v, String w){
		number = u;
		name = v;
		birth = w;
	}	
	public Wife(Husband a){
		h = a;
	}
}






