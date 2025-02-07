import java.util.Scanner;

class Perimeter{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter the radius: ");
int radius = sc.nextInt();

final float pi = 22/7;
float perimeter =2*pi*radius;
System.out.println("Perimeter of the circle: " + perimeter + " cm");

}
}
