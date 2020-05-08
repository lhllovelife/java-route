public class Homework04{
	public static void main(String[] args){
		Student s1 = new Student("张三", 18, "北京市", "463000", "15003565555");
		System.out.println(s1.getPostAddress());
	}
}

//学生类
class Student{
	private String name;
	private int age;
	private String address;
	private String zipCode;
	private String mobile;
	
	
	
	//无参构造
	public Student(){
		
	}
	//有参构造
	public Student(String name, int age, String address, String zipCode, String mobile){
		this.name = name;
		this.age = age;
		this.address = address;
		this.zipCode = zipCode;
		this.mobile = mobile;
	}
	
	//setter and getter
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return this.age;
	}
	
	public void SetAddress(String address){
		this.address = address;
	}
	public String getAddress(){
		return this.address;
	}
	
	public void setZipCode(String zipCode){
		this.zipCode = zipCode;
	}
	public String getZipCode(){
		return this.zipCode;
	}
	
	public void setMobile(String mobile){
		this.mobile = mobile;
	}
	public String getMoblie(){
		return this.mobile;
	}
	
	public String getPostAddress(){
		return "地址：" + this.getAddress() + " 邮编：" + this.getZipCode();
	}
	
}









