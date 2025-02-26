// A number containing 0 at end or in the middle anywhere but not at start is the duck number
import java.util.Scanner;
class DuckNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num = sc.nextInt();
		int temp=num;
		boolean flag=false;
		
		while(temp>0){  //The loop runs until temp becomes 0
		int rem= temp%10;  //Extract last digit
		if(rem==0){
			flag=true;
		    break;
		}
		temp/=10;   //remove last digit
		}
		if(flag && num/10!=0)
			System.out.print(num+" is Duck number");
		else
			System.out.print(num+" is not Duck number");
		
	}
}
