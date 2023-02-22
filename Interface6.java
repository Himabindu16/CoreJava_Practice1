
interface Demo1
{
	void disp();
	default void show()
	{
		System.out.println("Hello I'm in Interface");
	}
}

class Alien implements Demo1
{
	public void disp() 
	{
		System.out.println("Implementing display");		
	}
	
	public void show()
	{
		System.out.println("I have been overrided in child");
	}
}
public class Interface6 {

	public static void main(String[] args) {
		
		Demo1 d = new Alien();
		d.disp();
		d.show();
	}

}
