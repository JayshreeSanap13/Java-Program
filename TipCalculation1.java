import java.util.Scanner;

class TipCalculation1{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter the subtotal: ");
int subtotal = sc.nextInt();
System.out.println("Enter the rate: ");
float rate = sc.nextFloat();
float r = rate/100;

float tipAmount = r*subtotal;
System.out.println("The tipAmount is: "+tipAmount);
float totalBill = tipAmount+subtotal;
System.out.println("The totalBill is: "+totalBill);

}
}