// num+1 is perfect square number then it is sunny number
import java.util.Scanner;
class SunnyNumber 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the number:");
		int num = new Scanner(System.in).nextInt();
		
		int sum= num+1;
		System.out.println("sum:"+sum);
		
		double sqrt = Math.sqrt(sum);
		System.out.println("sqrt:"+sqrt);
		
		if(sqrt==(int)sqrt)
			System.out.print(num+" is Sunny number");
		else
			System.out.print(num+" is not Sunny number");
		
	}
}
