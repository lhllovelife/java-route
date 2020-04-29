public class Homework02{
	public static void main(String[] args){
		// Account cus = new Account("James Smith", "1000", 2000, 1.23);
		// cus.deposit(100); //存入100
		// cus.withdraw(960); //取出960
		// cus.withdraw(2000); //取出2000
		// cus.detail();
		Account a = new Account("6025335", 1000, 1.23); //创建一个账户
		Customer c1 = new Customer("James Smith", a);
		
		c1.getAct().deposit(100);
		c1.getAct().withdraw(960);
		c1.getAct().withdraw(2000);
		c1.detail();
	}
}
//客户类
class Customer{
	private String name; //客户名字
	private Account act; //客户对象
	
	//构造方法 无参
	public Customer(){
		
	}
	//构造方法有参 
	public Customer(String name, Account act){
		this.name = name;
		this.act = act;
	}
	
	//setter getter方法
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setAct(Account act){
		this.act = act;
	}
	public Account getAct(){
		return this.act;
	}
	
	public void detail(){
		System.out.println("Customer [" + this.name + "] has a account ：id is "+ this.act.getId() +" annualInterestRate is "+ this.act.getAnnualInterestRate() +"% balance is " + this.act.getBalance());
	}
}
//账户类
class Account{
	// private String act; //账户名字
	private String id;  //账号
	private double balance; //余额
	private double annualInterestRate; //年利率
	//无参数构造
	public Account(){
		
	}
	//有参构造方法
	public Account(String id, double balance, double annualInterestRate){
		// this.act = act;
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}
	
	//get set实例方法
	// public String getAct(){
		// return act;
	// }
	// public void setAct(String act){
		// this.act = act;
	// }
	
	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id = id;
	}
	
	public double getBalance(){
		return balance;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double setAnnualInterestRate){
		this.annualInterestRate = annualInterestRate;
	}
	
	//实例方法
	
	//取款
	public void withdraw(double x){
		if(x <= balance)
		{
			balance -= x;
			System.out.println("成功取出：" + x);
		}
		else System.out.println("余额不足，取钱失败");
	}
	//存款
	public void deposit(double x){
		balance += x;
		System.out.println("成功存入：" + x);
	}
	//输出全部信息
	// public void detail(){
		// System.out.println("Customer [" + act + "] has a account ：id is "+ id +" annualInterestRate is "+ annualInterestRate +"% balance is " + balance);
	// }
}



//  Customer [Smith，Jane] has a account ：id is 1000 annualInterestRate is 1.23% balance is 1140.0

//  Customer [James Smith] has a account ：id is 1000 annualInterestRate is 1.23% balance is 2000.0




