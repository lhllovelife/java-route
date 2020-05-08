public class ExtendsTest01{
	public static void main(String[] args){
		Cat c = new Cat();
		c.move();
	}	
}

//动物类
class Animal{
	String name = "Tom";
	public void move(){
		System.out.println(name + "正在移动");
	}
} 

class Cat extends Animal{
	
}