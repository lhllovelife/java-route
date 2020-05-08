public class Exercise{
	public static void main(String[] args){
		int stNum1 = 110;
		String stName1 = "张三";
		char stSex1 = '男';
		double stHeight1 = 1.85;
		
		// int name = 张三; 此时这里的 张三 被认为是一个变量名
		
 		System.out.println("学号：" + stNum1);
		System.out.println("姓名：" + stName1.charAt(1));
		System.out.println("性别：" + stSex1);
		System.out.println("身高：" + stHeight1);
	}
}