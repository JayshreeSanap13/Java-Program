//Number if it ends with 7 & is divisible by 7

import java.util.Scanner;
class BuzzNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num = sc.nextInt();
		
		if(num%10==7 || num%7==0)
			System.out.print(num+" is Buzz number");
		else
			System.out.print(num+" is not Buzz number");
		
	}
}
