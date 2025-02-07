//Check whether character is Uppercase or not

import java.util.Scanner;
class UpperCase{

public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Character: ");
char ch = sc.next().charAt(0);

//we can also write 'A' in place of 65 and 'Z' in place of 90 of both are same because //65 and 90 are the ASCII value of A and Z.

String c = (ch>='A' && ch<='Z') ? ("Uppercase") : ("Not Uppercase");
System.out.println(c);
}
}
