

public class Modifier {
	void fun()
	{
		System.out.println("This is a public class");
	}
public static void main(String args[])
{
	Modifier obj1=new Modifier();
	finalclass obj2=new finalclass();
	sub obj3=new sub();
	obj1.fun();
	obj2.show();
	obj3.function();
	
}
}
abstract class abstractclass{
	void function()
	{
		System.out.println("This is a abstract class");
	}
}

class sub extends abstractclass{

}
final class finalclass{
	void show()
	{
		System.out.println("This is a final class and its not inherited");
	}
}