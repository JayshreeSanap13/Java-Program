import java.util.Scanner;
class NumberOfYears{
public static void main(String[]args){


System.out.println("Enter the number of minutes: ");
long minutes = new Scanner(System.in).nextLong();

final long minutesInDay = 24 * 60;
final long dayInYear = 365;


long totalDays = minutes/minutesInDay;
long years = totalDays / dayInYear;
long remDays = totalDays % dayInYear;

System.out.println(minutes + " minutes is approximately " + years + " years and " + remDays + " days");


}
}