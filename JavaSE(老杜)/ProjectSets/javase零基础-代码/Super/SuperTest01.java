public class SuperTest01{
	public static void main(String[] args){
		// super()
		Vip v1 = new Vip("张三");
		v1.shopping();
		v1.doSome();
	}
}
class Root{
	String name;
	public Root(){
		
	}
	public Root(String name){
		this.name = name;
	}
}

class Customer extends Root{
	String name;
	public Customer(){
		
	}
	public Customer(String name){
		this.name = name;  /*张三*/
	}
	public void doSome(){
		System.out.println(this.name + "do some"); /*张三*/
		System.out.println(super.name + "do some");/*null*/
		
	}
}

class Vip extends Customer{
	String name;
	public Vip(){
		
	}
	public Vip(String name){
		super(name); /*1 name为null */
	}
	public void shopping(){
		System.out.println(this.name + "正在购物"); /*null*/
		System.out.println(super.name + "正在购物"); /*张三*/
		System.out.println(name + "正在购物"); /*null*/
	}
}
/*
1 A的无参构造 执行		
3 B的有参构造 执行 String
6 C的有参构造 执行 String  Int
5 C的有参构造 执行 String 
4 C的无参构造	执行
*/