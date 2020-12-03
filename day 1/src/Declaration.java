
public class Declaration {
class innerclass{
	void show()
	{
		System.out.println("This is belonged to  inner class");
	}
}
	innerclass obj2=new innerclass();
	
	void fun()
	{
		System.out.println("this is belonged to class Declaration");
		obj2.show();
	}
}
class Main1{
	public static void main(String args[])
	{
		Declaration obj1=new Declaration();
		obj1.fun();
		
	}
}