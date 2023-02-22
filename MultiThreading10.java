
class Demo extends Thread
{
	public void run()
	{
		int c=10/0;
	}
}

public class MultiThreading10 {

	public static void main(String[] args) {
		
		Thread t = new Thread(new Demo());
		t.start();
		System.out.println("hello");
	}

}
