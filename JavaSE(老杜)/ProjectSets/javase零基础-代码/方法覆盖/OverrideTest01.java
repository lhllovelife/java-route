public class OverrideTest01{
	public static void main(String[] args){
		//创建鸟对象
		Bird b = new Bird();
		b.move();
		Cat c = new Cat();
		c.move();
	}
}

//父类
class Animal{
	//方法覆盖：将继承过来的方法覆盖掉掉，继承过来的方法没了。
	public void move(){
		System.out.println("动物在移动");
	}

}

//子类
class Bird extends Animal{
	public void move(){
		System.out.println("小鸟在飞翔");
	}
	// public int move(){
		// System.out.println("int类型");
	// }		
}
//子类
class Cat extends Animal{
	protected void move(){
		System.out.println("猫在走猫步");
	}	
}