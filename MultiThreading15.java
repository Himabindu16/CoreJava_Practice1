
public class MultiThreading15 {

	public static void main(String[] args) {
		
		Thread t = Thread.currentThread();
		
//		System.out.println(t.isDaemon());
//		t.setDaemon(true);

		System.out.println(t.isDaemon()); 
		
		Thread t1 = new Thread();
		
		System.out.println(t1.isDaemon());
		t1.setDaemon(true);

		System.out.println(t1.isDaemon());
	}

}
