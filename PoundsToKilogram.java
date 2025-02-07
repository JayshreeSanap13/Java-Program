import java.util.Scanner;
class PoundsToKilogram{
public static void main(String[]args){


System.out.println("Enter a number in pounds: ");
double pound = new Scanner(System.in).nextDouble();

double kilogram = (pound*0.454);
System.out.println(pound + " pounds is " + kilogram + " kilograms");


}
}




