
class Telusko 
{
	private String name; //private members will not participate in inheritance to preserve - encapsulation
	private int age;
	
	Telusko()
	{
		System.out.println("Parent Class");
	}
	
}
class Alien extends Telusko 
{
	Alien()
	{
		super();
		System.out.println("Child Class");
	}
	
}



public class Inheritance11 {

	public static void main(String[] args) {
		
		Alien a = new Alien();
		//a.name = "Alien";      Encapsulation - private


	}

}
