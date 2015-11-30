import java.util.*;

class rev
{
public static void main(String arg[])
{
int sum=0;
Scanner sc=new Scanner (System.in);
System.out.println("enter the number");
int num=sc.nextInt();
while(num<0)
{
int a=num%10;
sum=sum+a*10;
num=num/10;
}
System.out.println("the number is "+sum);
}
}

