class puppy2
{
int age;
public puppy2(String name)
{
System.out.println("the name is "+name);
}
public void setage(int puppyage)
{
age= puppyage;
}
public int getage()
{
System.out.println("the age of puppy is"+age);
return age;}

public static void main(String arg[])
{
puppy2 pp= new puppy2("tommy");
pp.setage(3);
pp.getage();
}
}
