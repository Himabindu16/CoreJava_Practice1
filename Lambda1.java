
interface Computer
{
	void show();
}

class Laptop implements Computer
{
	public void show()
	{
		System.out.println("in show");
	}
}
public class Lambda1 {

	public static void main(String[] args) 
	{
				
//		Computer com = new Computer() 
//		{
//			public void config()
//			{
//				System.out.println("i9, 32gb, 1TB");
//			}
//		};

		Computer com = () -> System.out.println("in show 1");
		com.show();
	}

}
