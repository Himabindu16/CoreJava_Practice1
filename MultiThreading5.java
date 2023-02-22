
class Demo1
{
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
}

class Demo2
{
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
}

class Demo3
{
	public void calculation()
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

public class MultiThreading5 {

	public static void main(String[] args) throws Exception {
		
		Demo1 d1 = new Demo1();
		Demo2 d2 = new Demo2();
		Demo3 d3 = new Demo3();
		
		d1.banking();
		d2.printing();
		d3.calculation();
	}

}
