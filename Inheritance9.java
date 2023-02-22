//When we create object of Subclass, 
//it calls the constructor of super class also 

class X
{
	public X() 
	{		
		super();
		System.out.println("in X");
	}
	
	public X(int i)
	{
		super();
		System.out.println("in X int");
	}
}

class Y extends X
{
	public Y() 
	{
		super();
		System.out.println("in Y");
	}
	public Y(int i)
	{
		super(6);
		System.out.println("in Y int");
	}
}

public class Inheritance9 {

	public static void main(String[] args) 
	{
		Y obj = new Y(7);		
	}

}
