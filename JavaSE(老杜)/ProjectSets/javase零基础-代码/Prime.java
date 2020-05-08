import java.util.Scanner;

public class Prime{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num, result;
		num = sc.nextInt();
		result = f(num);
		System.out.println(result);
	}
	public static int f(int n){
		for(int i = n+1; ;i++)
		{
			int j;
			boolean tag = true;
			for(j = 2; j <= Math.pow(i,0.5); j++)
			{
				if(i%j==0)
				{
					tag = false;
					break;
				} 
			}
			if(tag) return i;
		}
	}
}