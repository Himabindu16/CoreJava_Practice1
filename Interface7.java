
interface Telusko
{
	void disp();
	static void show()
	{
		System.out.println("I'm static method of an interface");
	}	
	//Java 9
	default void show2()
	{
		show1();
	}
	private void show1()
	{
		System.out.println("I'm in private");
	}
}

public class Interface7 {

	public static void main(String[] args) 
	{
		Telusko.show();		
	}

}