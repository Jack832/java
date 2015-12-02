import java.io.*;
class variables
{
static int a=120;
public void get()
{
int b=10;
System.out.println("the value of b"+b);
System.out.println("the value of a"+a);
}
public void gett()
{
 int c=11;
a=1200;
System.out.println("the value of c"+c);
System.out.println("the value of a"+a);
}
}
class variable
{
public static void main(String arg[])
{
variables v= new variables();
v.get();
v.gett();
}
}

