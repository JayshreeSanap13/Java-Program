import java.util.Scanner;

class Rectangle{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter the width: ");
int width = sc.nextInt();
System.out.println("Enter the height: ");
int height = sc.nextInt();

float area = width*height;
System.out.println("Area of the rectangle: " + area + " cm^2");
float perimeter = 2*(width+height);
System.out.println("Perimeter of the rectangle: " + perimeter + " cm");
}
}
