import java.util.Scanner;
class Bmi{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter weight in pounds:");
float w = sc.nextFloat();
System.out.println("Enter height in inches:");
float h = sc.nextFloat();

float weight = w*0.45359237f;
float height = h*0.0254f;
float bmi = weight/(height*height);

System.out.println("BMI is " + bmi);

}
}
