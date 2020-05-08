public class Homework01{
	public static void main(String[] args)
	{
		Book b1 = new Book("计算机程序设计", 150);
		b1.detail();
		// Book b2 = new Book("Java程序设计", 180);
		b1.setTitle("高等数学");
		b1.detail();
	}
}

class Book{
	//实例变量
	private String title;  //名称
	private int pageNum;  //页数
	
	//无参构造
	public Book(){
		
	}
	//有参构造
	public Book(String s, int a){
		title = s;
		if(a < 200)
		{
			System.out.println("页数不能少于200，少于200则赋值为200");
			pageNum = 200;
		}
		else pageNum = a;
	}
	
	public String getTitle(){
		return title;
	}
	public void setTitle(String s){
		title = s;
	}
	
	public int getPageNum(){
		return pageNum;
	}
	public void setPageNum(int a){
		if(a<200){
			System.out.println("本书页数不能少于200，赋默认值200。");
			pageNum = 200;
			return ;
		}
		pageNum = a;
	}
	public void detail(){
		System.out.println("教材名称：" + this.title + "总页数" + this.pageNum);
	}
}


