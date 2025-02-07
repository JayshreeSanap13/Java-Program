import java.util.Scanner;
class UserName{
public static void main(String[]args)throws InterruptedException
{

Scanner sc = new Scanner(System.in);
System.out.println("Enter the username:");
String us = sc.next().toUpperCase();
int len = us.length();

for(int i = 0; i<len; i++)
{
System.out.print(us.charAt(i));
Thread.sleep(2000);
}
}
}

