class Mo
{
static int clsStrngth=235;
String clsColour;
String clsType;
Mo(String a,String b)
{
clsColour=a;
clsType=b;
}
public static void main(String[] args)
{
Mo m=new Mo("yellow","seventh");
System.out.println(m.clsStrngth);
System.out.println(m.clsType);
System.out.println(m.clsColour);
}
}
