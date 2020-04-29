/*
1.编写程序实现乐手弹奏乐器。乐手可以弹奏不同的乐器从而发出不同的声音。
可以弹奏的乐器包括二胡、钢琴和琵琶。
	实现思路及关键代码：
		1)定义乐器类Instrument，包括方法makeSound()
		2)定义乐器类的子类：二胡Erhu、钢琴Piano和小提琴Violin
		3)定义乐手类Musician，可以弹奏各种乐器play(Instrument i)
		4)定义测试类，给乐手不同的乐器让他弹奏
*/

//公共类 测试类
public class Homework01{
	public static void main(String[] args){
		Musician m1 = new Musician("张三");
		Musician m2 = new Musician("李四");
		Musician m3 = new Musician("王五");
		Instrument i1 = new Erhu();
		Instrument i2 = new Piano();
		Instrument i3 = new Violin();
		m1.play(i1);
		m2.play(i2);
		m3.play(i3);
	}
}

//乐器类 父类
class Instrument{
	//乐器发声音方法
	public void makeSound(){ 
		System.out.println("发出声音");
	}
}
//二胡 子类
class Erhu extends Instrument{
	public void makeSound(){
		System.out.println("正在弹奏二胡，发出二胡的声音");
	}
}
//钢琴 子类
class Piano extends Instrument{
	public void makeSound(){
		System.out.println("正在弹奏钢琴，发出钢琴的声音");
	}
}
//小提琴 子类
class Violin extends Instrument{
	public void makeSound(){
		System.out.println("正在弹奏小提琴，发出小提琴的声音");
	}
}
//乐手类
class Musician{
	private String name;
	//构造方法
	public Musician(){
		
	}
	public Musician(String name){
		this.name = name;
	}
	//settter and getter
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void play(Instrument i){ //实例方法
		// if(i instanceof Erhu)
		// {
			// Erhu e = (Erhu)i;
			// System.out.print(this.name + " ");
			// e.makeSound();
		// }
		// else if(i instanceof Piano)
		// {
			// Piano p = (Piano)i;
			// System.out.print(this.name + " ");
			// p.makeSound();
		// }
		// else if(i instanceof Violin)
		// {
			// Violin v = (Violin)i;
			// System.out.print(this.name + " ");
			// v.makeSound();
		// }
		System.out.print(this.name + " ");
		i.makeSound();
		
	}
}