
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
		System.out.println("Cargo plane requires longer size runway to takeOff");
	}
}

class PassengerPlane extends Plane 
{
	public void fly()
	{
		System.out.println("Passenger Plane flies at medium height");
	}
	
	public void takeOff()
	{
		System.out.println("Passenger plane requires medium size runway to takeOff");
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

class Airport
{
	public void permit(Plane p)
	{
		p.takeOff();
		p.fly();
	}
}

public class Polymorphism3 
{

	public static void main(String[] args) 
	{
		CargoPlane cp = new CargoPlane();
		FighterPlane fp = new FighterPlane();
		PassengerPlane pp = new PassengerPlane();

		Airport a = new Airport();
		a.permit(cp);
		a.permit(fp);
		a.permit(pp);

	}

}
