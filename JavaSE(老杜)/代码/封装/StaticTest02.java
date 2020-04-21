public class StaticTest02{
	public static void main(String[] args){
		Chinese c1 = new Chinese("110", "张三");
		System.out.println(c1.idCard);
		System.out.println(c1.name);
		System.out.println(Chinese.country);
		System.out.println("------------");
		Chinese c2 = new Chinese("120", "李四");
		System.out.println(c2.idCard);
		System.out.println(c2.name);
		System.out.println(Chinese.country);		
	}
}
class Chinese{
	String idCard;
	String name;
	static String country = "中国";
	public Chinese(){
		
	}
	public Chinese(String num, String xingMing){
		idCard = num;
		name = xingMing;
		// country = guoJi;
		
	}
}