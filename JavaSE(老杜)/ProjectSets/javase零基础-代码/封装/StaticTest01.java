public class StaticTest01{
	public static void main(String[] args){
		Chinese c1 = new Chinese("110", "张三", "中国");
		System.out.println(c1.idCard);
		System.out.println(c1.name);
		System.out.println(c1.country);
		Chinese c2 = new Chinese("120", "李四", "中国");
		System.out.println(c2.idCard);
		System.out.println(c2.name);
		System.out.println(c2.country);		
	}
}
class Chinese{
	String idCard;
	String name;
	String country;
	public Chinese(){
		
	}
	public Chinese(String num, String xingMing, String guoJi){
		idCard = num;
		name = xingMing;
		country = guoJi;
		
	}
}