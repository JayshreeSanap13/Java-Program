import java.util.Scanner;

class CelciusToFahrenheit{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter the celcius temperature: ");
int celcius = sc.nextInt();

final double a = 9.0/5.0;
final double b = 32.0;
double fahrenheit = (a * celcius)+b;
System.out.println("Celcius to Fahrenheit: " + fahrenheit + " f");

}
}