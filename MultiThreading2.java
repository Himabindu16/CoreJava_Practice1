
public class MultiThreading2 
{

	public static void main(String[] args) {
		
		System.out.println("Hello From Here");
		
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		t.setName("Himabindu code");
		t.setPriority(4);
		System.out.println(t);
		//System.out.println("Thread is executing this after a NAP");
		
	}

}
