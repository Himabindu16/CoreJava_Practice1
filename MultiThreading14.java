
class Warrior implements Runnable
{
	String res1 = new String("Brahmastra");
	
	String res2 = new String("Pashupastra");
	
	String res3 = new String("Sarpastra");
	
	public void run()
	{
		try
		{
			String s1 = Thread.currentThread().getName();
			if(s1.equals("Rama"))
			{
				ramaAcqRes();
			}
			else
			{
				ravanaAcqRes();
			}
		}
		catch(Exception e)
		{
			System.out.println();
		}
		
	}
	
	
	public void ramaAcqRes()
	{
		try
		{
			Thread.sleep(3000);
			synchronized (res1) 
			{
				System.out.println("Rama has Acquired: "+ res1);
				Thread.sleep(3000);
				synchronized (res2) 
				{
					System.out.println("Rama has Acquired: "+ res2);
					Thread.sleep(3000);
					synchronized (res3) 
					{
						System.out.println("Rama has Acquired: "+ res3);					
					}
				}			
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void ravanaAcqRes()
	{
		try
		{
			Thread.sleep(3000);
			synchronized (res3) 
			{
				System.out.println("Ravana has Acquired: "+ res3);
				Thread.sleep(3000);
				synchronized (res2) 
				{
					System.out.println("Ravana has Acquired: "+ res2);
					Thread.sleep(3000);
					synchronized (res1) 
					{
						System.out.println("Ravana has Acquired: "+ res1);					
					}
				}			
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

public class MultiThreading14 
{

	public static void main(String[] args) 
	{
		
		Warrior w = new Warrior();
		
		Thread t1 = new Thread(w);
		Thread t2 = new Thread(w);

		t1.setName("Rama");
		t2.setName("Ravana");
		
		t1.start();
		t2.start();
	}		
}