
class Plane {
	
	public void fly()
	{
		System.out.println("Plane is flying");
	}
	
	public void takeOff()
	{
		System.out.println("Plane is taking Off");
	}
}

class CargoPlane extends Plane 
{
	public void fly()
	{
		System.out.println("Cargo Plane flies at lower height");
	}
	
	public void takeOff()
	{
		System.out.println("Cargo plane requires longer runway to takeOff");
	}
}


class FighterPlane extends Plane {

	public void fly()
	{
		System.out.println("Fighter Plane flies at high height");
	}
	
	public void takeOff()
	{
		System.out.println("Fighter Plane requires short runway to takeOff");
	}
}


public class Polymorphism1 

{

	public static void main(String[] args) {
		
		CargoPlane cp = new CargoPlane();
		FighterPlane fp = new FighterPlane();

		Plane p;
		p=cp;
		p.takeOff();
		p.fly();
		
		p=fp;
		p.takeOff();
		p.fly();
	}

}
