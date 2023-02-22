
public class MultiThreading3 
{

	public static void main(String[] args) 
	{
		System.out.println("Hello from Here");
		
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		String name = Thread.currentThread().getName();
		System.out.println(name);
		
		int priority = Thread.currentThread().getPriority();
		System.out.println(priority);
	}

}
