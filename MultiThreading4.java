
public class MultiThreading4 
{

	public static void main(String[] args) throws Exception
	{
		System.out.println("Banking task started");

		for(int i=0;i<3;i++)
		{
			Thread.sleep(2000);
			System.out.println("Banking.............");
		}
		System.out.println("Banking completed........");
		
		System.out.println("---------------------------------------");
		
		System.out.println("Printing activity");

		for(int i=0;i<3;i++)
		{
			Thread.sleep(2000);
			System.out.println("Printing .............");
		}
		System.out.println("Printing completed........");

		System.out.println("----------------------------------------");
		
		
		System.out.println("Calculation task started");

		for(int i=0;i<3;i++)
		{
			Thread.sleep(2000);
			System.out.println("Some calculation.............");
		}
		System.out.println("Calculation completed........");

	}

}
