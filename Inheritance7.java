
class X
{
	public X() 
	{
		System.out.println("in X");
	}
	
}

class Y extends X
{
	public Y() 
	{
		System.out.println("in Y");
	}

}


public class Inheritance7 {

	public static void main(String[] args) {
		Y obj = new Y();		
		
	}

}
