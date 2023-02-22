
class Computer
{
	public void config()
	{
		System.out.println("i7, 16gb, 1TB");
	}
}

class Laptop extends Computer
{
	public void config()
	{
		System.out.println("i9, 32gb, 1TB");
	}
}

public class MethodOverriding1 {

	public static void main(String[] args) {
		
		Computer com = new Laptop();
		com.config();

	}

}
