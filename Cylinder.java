import java.util.Scanner;

class Cylinder{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter the radius of the cylinder: ");
float radius = sc.nextFloat();
System.out.println("Enter the height of the cylinder: ");
float height = sc.nextFloat();

final float pi = 3.14f;
float area = pi*radius*radius;
System.out.println("Area of the cylinder: " + area + " cm^2");

float volume = area*height;
System.out.println("Volume of the cylinder: " + volume + " cm^3");


}
}