//Check whether Digit or not

import java.util.Scanner;
class Digit{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter a character: ");
char ch = sc.next().charAt(0);

//we use direct '0' and '9' in quotes it also working(write anything ascii or actual digit)

String digit = (ch>='0' && ch<='9') ? (ch+" It is a Digit") : ("Not a Digit");
System.out.println(digit);
}
}
