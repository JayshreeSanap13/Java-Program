// num=5 then 5^2=25
// last digit of sqr = num then it is AutomorphicNumber 
import java.util.Scanner;
class AutomorphicNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int len = 0;
		int div = 1;
		 for(int i = num; i>0; i/=10)
			 len++;
		 for(int i = 1; i<=len; i++)
			 div *= 10;
		 if(num == (num*num)%div)
			 System.out.println(num+" is AutomorphicNumber");
		 else
			 System.out.println(num+" is not AutomorphicNumber");
		 
	}
}
