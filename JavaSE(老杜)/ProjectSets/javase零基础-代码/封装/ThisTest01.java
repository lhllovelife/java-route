public class ThisTest01{
	public static void main(String[] args){
		Customer c1 = new Customer("张三");
		Customer c2 = new Customer("李四");
		c1.shopping();
		c2.shopping();
		
		Customer.doSome();
	}
}

class Customer{
	String name;
	
	//构造方法
	public Customer(){
		
	}
	
	public Customer(String s){
		name = s;
	}
	
	//实例方法
	public void shopping(){
		System.out.println(this.name + "正在购物！");
	}
	//静态方法
	public static void doSome(){
		System.out.println("doSome静态方法执行");
		// System.out.println(name);
	}
}