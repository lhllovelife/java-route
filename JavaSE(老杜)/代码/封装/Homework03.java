public class Homework03{
	public static void main(String[] args){
		//无参数构造
		Ha h1 = new Ha();
		h1.detail();
		
		//有参数构造
		Ha h2 = new Ha(2008, 8, 8);
		h2.detail();
	}
}
class Ha{
	private int year;
	private int month;
	private int day;
	
	//构造方法 无参
	public Ha(){
		// this.year = 1970;
		// this.month = 1;
		// this.day = 1;
		this(1111, 1, 1);
	}
	//构造方法 有参
	public Ha(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	// setter and getter
	public void setYear(int year){
		this.year = year;
	}
	public int getYear(){
		return year;
	}
	public void setMonth(int month){
		this.month = month;
	}
	public int getMonth(){
		return month;
	}
	public void setDay(int day){
		this.day = day;
	}
	public int getDay(){
		return day;
	}
	
	public void detail(){
		System.out.println(year + "年" + month + "月" + day + "日");
	}
}