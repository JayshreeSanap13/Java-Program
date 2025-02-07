import java.util.Scanner;
class Num1{
public static void main (String[]args){

System.out.println("Enter the number:");
int num = new Scanner(System.in).nextInt();
int sum = 0;

while(num>0)
{
int rem = num % 10;
if (rem % 2 == 0) { 
sum += rem;
}
num = num/10;
}
System.out.print(sum);

}
}