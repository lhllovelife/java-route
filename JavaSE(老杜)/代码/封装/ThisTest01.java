public class ThisTest01{
	public static void main(String[] args){
		Customer c1 = new Customer("张三");
		Customer c2 = new Customer("李四");
		c1.shopping();
		c2.shopping();
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
		System.out.println(name + "正在购物！");
	}
}