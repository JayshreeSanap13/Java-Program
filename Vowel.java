import java.util.Scanner;
class Vowel{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter the username:");
String ch = sc.next();
int len = ch.length();

for (int i = 0; i < len; i++) {
char c = ch.charAt(i);
if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
System.out.print(c);
}
}
}
}