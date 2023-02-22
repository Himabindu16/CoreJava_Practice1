
class Animal
{
	public void eat()
	{
		System.out.println("Animals are eating");
	}
	
	public void sleep()
	{
		System.out.println("Animals are sleeping");
	}
}

class Tiger extends Animal
{
	public void eat()
	{
		System.out.println("Tiger eats by hunting");
	}
	
	public void sleep()
	{
		System.out.println("Tiger sleeps in caves");
	}
	
}

class Monkey extends Animal
{
	public void eat()
	{
		System.out.println("Monkey eats by stealing");
	}
	
	public void sleep()
	{
		System.out.println("Monkey sleeps on tree");
	}
}

class Deer extends Animal
{
	public void eat()
	{
		System.out.println("Deer eats by grazing");
	}
	
	public void sleep()
	{
		System.out.println("Deer sleeps in fields");
	}
}

class Forest
{
	public void zoo(Animal a) 
	{
		a.eat();
		a.sleep();		
	}
}

public class Polymorphism4 
{

	public static void main(String[] args) 
	{
		Tiger t = new Tiger();
		Monkey m = new Monkey();
		Deer d = new Deer();
		
		Forest f = new Forest();
		f.zoo(t);
		f.zoo(m);
		f.zoo(d);
	}

}
