// num=9 then 9^2=81
// 8+1=9 ie sum of sqr == num, then it is neon number
import java.util.Scanner;
class NeonNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num = sc.nextInt();
		int sum = 0;
		int sqr = num*num;
	
		for(int i =sqr; i>0; i/=10){
		 int rem = i%10;
		 sum += rem;
		}
		if(sum==num) 
		 System.out.print(num+ " is Neon Number");
		 else
		 System.out.print(num+ " is not Neon Number");
	}
}

