
class Demo1 implements Runnable
{
	public void run()
	{
		System.out.println("Banking task started");

		for(int i=0;i<3;i++)
		{
			try 
			{
				Thread.sleep(2000);
				System.out.println("Banking.............");
			}
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		System.out.println("Banking completed........");
	}

}

class Demo2 implements Runnable
{
	public void run()
	{
		System.out.println("Printing activity");

		for(int i=0;i<3;i++)
		{
			try 
			{
				Thread.sleep(2000);
				System.out.println("Printing .............");
			} 
			catch (InterruptedException e) 
			{				
				e.printStackTrace();
			}		
		}
		System.out.println("Printing completed........");
	}

}

class Demo3 implements Runnable
{
	public void run()
	{
		System.out.println("Calculation task started");

		for(int i=0;i<3;i++)
		{
			try 
			{
				Thread.sleep(2000);
				System.out.println("Some calculation.............");
			} 
			catch (InterruptedException e) 
			{			
				e.printStackTrace();
			}			
		}
		
		System.out.println("Calculation completed........");
	}

}

public class MultiThreading7 
{

	public static void main(String[] args) 
	{
		
		Demo1 d1 = new Demo1();
		Demo2 d2 = new Demo2();
		Demo3 d3 = new Demo3();
		
		Thread t1 = new Thread(d1);
		Thread t2 = new Thread(d2);
		Thread t3 = new Thread(d3);

		t1.start();
		t2.start();
		t3.start();
	}

}
