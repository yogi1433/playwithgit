class Head
{
double area(int r)
{
final double pi=3.142;
double res=pi*r*r;
return res;
}
public static void main(String[] args)
{
double x=new Head().area(25);
System.out.println(x);
}
}