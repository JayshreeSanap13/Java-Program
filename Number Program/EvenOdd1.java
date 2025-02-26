import java.util.Scanner;

class EvenOdd1{
public static void main(String[]args){

System.out.println("Enter the number: ");
int num = new Scanner(System.in).nextInt();
//System.out.println((num/2)==(num/2.0));//Without using modulus logic1
System.out.println((num/2)*2==num);//Without using modulus logic2


}
}