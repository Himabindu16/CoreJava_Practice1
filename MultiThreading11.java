
class BathRoom implements Runnable
{
	synchronized public void run()
	{
		try 
		{
			System.out.println(Thread.currentThread().getName() + " has entered the bathroom");
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName() + " is using BathRoom");
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName() + " exited the bathroom");
			
			
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
}
public class MultiThreading11 
{

	public static void main(String[] args) throws InterruptedException 
	{
		BathRoom b = new BathRoom();
		
		
		Thread t1 = new Thread(b);
		Thread t2 = new Thread(b);
		Thread t3 = new Thread(b);
		
		t1.setName("BOY");
		t2.setName("GIRL");
		t3.setName("TIKTOKER");

		
		t1.start();
		//t1.join();
		t2.start();
		//t2.join();
		t3.start();
	}

}
