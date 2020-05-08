import java.util.Scanner;


 public class RecursionTest{
	 public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		 int num = sc.nextInt();
		 System.out.println(total(num));
		 System.out.println(recurTotal(num));
		 // doSome();
	 }
	 public static int recurTotal(int n){
		 if(n==1) return 1;
		 return n + recurTotal(n-1);
		 // System.out.println("doSome begin");
		 // doSome();
		 // System.out.println("doSome over"); 		
	 }
	 public static int total(int n){
		 int sum = 0;
		 for(int i = 1; i <= n; i++)
			sum += i;
		return sum;
	 }
 }

 