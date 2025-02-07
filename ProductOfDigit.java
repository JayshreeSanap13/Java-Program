class ProductOfDigit{
public static void main(String[] args){

int num = 1234;
int product;


int rem1 = num%10;//4
num = num /10;//123
int rem2 = num%10;//3
product =rem1*rem2;//12

num = num /10;//12
int rem3 = num%10;//2
product= product*rem3;//24

num = num /10;//1
product = product*num;

System.out.println("Product of digits is: "+product);
}
}
