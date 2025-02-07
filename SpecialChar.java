//Check whether special character or not

import java.util.Scanner;
class SpecialChar{
public static void main(String[]args){

System.out.println("Enter a String: ");
char ch = new Scanner(System.in).next().charAt(0);


String speChar = (ch>='A' && ch<='Z' || ch>='a' && ch<='z' || ch>='0' && ch<='9') ? (ch+" not Special character") : (ch+" is Special character");
System.out.println(speChar);
}
}
