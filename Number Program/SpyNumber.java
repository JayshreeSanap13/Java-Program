//if sum of digit == product of digit then it is spy number
import java.util.Scanner;
class SpyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num = sc.nextInt();
		int temp=num;
		
		int sum=0;
		int product=1;
		
		while(temp>0){
		int rem= temp%10;
		sum += rem;
		product *= rem;
		temp /=10;
		}
		
		if(sum==product)
			System.out.print(num+" is Spy number");
		else
			System.out.print(num+" is not Spy number");
		
	}
}
