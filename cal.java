import java.util.*;
class cal
{
public static void main(String arg[])
{
int a,dayofmonth;
Scanner sc=new Scanner (System.in);
System.out.println("enter the month");
int month=sc.nextInt();

switch(month)
{
case 1:
case 3:
case 5:
case 7:
case 8:
case 10:
case 12:
dayofmonth=31;
System.out.println("no of days"+dayofmonth);
break;
case 4:
case 6:
case 9:
case 11:
dayofmonth=30;
System.out.println("no of days"+dayofmonth);
case 2:
dayofmonth=28;
System.out.println("no of days"+dayofmonth);
break;

default:
System.out.println("invalid month no");
break;
}
}
}

