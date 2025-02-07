class CondOperator1{
public static void main(String[]args){
int a = 25;
int b = 4;
int c = 5;
int small = (a<b)?((a<c)?(a):(c)):((b<c)?(b):(c));
System.out.println(small);
}
}
