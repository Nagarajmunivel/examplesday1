
public class classmember {
public int a;
private int b;
protected int c;
public static void main (String args[])
{
	public1 obj1=new public1();
	classmember obj2=new classmember();
	obj1.dum();
	obj2.b=30;
	System.out.println("the value of b is"+obj2.b);
}
}
