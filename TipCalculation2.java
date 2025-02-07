import java.util.Scanner;
class TipCalculation2{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter the bill: ");
float bill = sc.nextFloat();
System.out.println("Enter the tipRate: ");
float tipRate = sc.nextFloat();

float tipAmount = (tipRate*bill)/100;
float totalBill = bill+tipAmount;
System.out.println("The tipAmount is: "+tipAmount);
System.out.println("The totalBill is: "+totalBill);

}
}