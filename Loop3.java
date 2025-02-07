class Loop3{
public static void main(String[]args){

for(int i=1; i<=10; i++)
{
System.out.print(i+" ");
}

System.out.println();

for(char ch='A'; ch<='Z'; ch++)
{
System.out.print(ch+" ");
}

System.out.println();

for(char sc='z'; sc>='a'; sc--)
{
System.out.print(sc+" ");
}

System.out.println();

for(char sc='0'; sc<='9'; sc++)
{
System.out.print(sc+" ");
}

System.out.println();

for(int b=0; b<=127; b++)
{
System.out.println(b+": "+((char)b));
}

}
}