public class Last{
	public static void main(String[] args){
		//创建丈夫对象
		Husband x = new Husband("9527", "小明", "1995-06-22");
		//创建妻子对象
		Wife y = new Wife("6502", "小红", "2005-05-03");
		//Marry
		x.w = y;
		y.h = x;
		//输出
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

//丈夫类
class Husband{
	String number; //身份证号 实例变量
	String name; //姓名
	String birth;//出生日期
	Wife w; //男人的妻子 引用类型 该处默认值是null. 后期会赋值（地址）
	//无参数构造方法
	public Husband(){
		
	}
	//有参数构造 
	public Husband(String u, String v, String w){
		number = u;
		name = v;
		birth = w;
	}
	public Husband(Wife a){
		w = a;
	}
}
//妻子类
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






