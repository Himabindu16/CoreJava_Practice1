
class Alpha extends Thread
{
	public void run()
	{
		String t = Thread.currentThread().getName();
		if(t.equals("BANK"))
		{
			banking();
		}
		else if(t.equals("PRINT"))
		{
			printing();
		}
		else
		{
			calc();
		}
	}
	
	public void banking()
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
	
	public void printing()
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

	public void calc()
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

public class MultiThreading8 {

	public static void main(String[] args) {
	
		Alpha a1 = new Alpha();
		Alpha a2 = new Alpha();
		Alpha a3 = new Alpha();

		a1.setName("BANK");
		a2.setName("PRINT");
		a3.setName("CALC");
		
		a1.start();
		a2.start();
		a3.start();
	}

}
