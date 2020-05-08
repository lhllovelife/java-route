public class OverrideTest02{
	public static void main(String[] args){
		Chinese c = new Chinese();
		American a = new American();
		c.setName("张三");
		a.setName("Tom");
		c.speak();
		a.speak();
	}
}

//父类
class People{
	private String name;
	
	//构造方法
	public People(){
		
	}
	public People(String name){
		this.name = name;
	}
	
	//setter and getter
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	
	public void speak(){
		System.out.println(this.getName() + "....");
	}
	
}

//中国人 子类
class Chinese extends People{
	public void speak(){
		System.out.println(this.getName() + "正在说中文");
	}
}
//美国人 子类
class American extends People{
	public void speak(){
		System.out.println(this.getName()+ " is speaking English");
	}	
}