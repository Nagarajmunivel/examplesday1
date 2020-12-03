
public class Main {
	private int weight=60, salary=12,age=26;
	public String name="Raj",colour="brown";
	void show ()
	{
		System.out.println("My weight is " + weight );
		System.out.println("My salary is " + salary );
		System.out.println("My age is " + age );
	}
}

class Anotherperson{
	public static void main(String args[])
	{
		Main obj=new Main();
		System.out.println("His name is"+ obj.name);
		System.out.println("His name is"+ obj.colour);
		
	}
}