//Check whether character is Lowercase or not

import java.util.Scanner;
class LowerCase{

public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Character: ");
char ch = sc.next().charAt(0);

//we can also write 'a' in place of 97 and 'z' in place of 122 of both are same because 97 and //122 are the ASCII value of A and Z.

String lowercase = (ch>='a' && ch<='z') ? (ch+" is in lowercase") : (ch+" Not in Lowercase");
System.out.println(lowercase);
}
}
