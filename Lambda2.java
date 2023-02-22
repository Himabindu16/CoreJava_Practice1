
interface Computer
{
	void show(int num);
}
public class Lambda2 {

	public static void main(String[] args) {
		 
		Computer com = new Computer() 
		{
			public void show(int num)
			{
				System.out.println("in show: "+num);
			}
		};
		com.show(10);
		
		Computer com1 = new Computer() 
		{
			public void show(int num)
			{
				System.out.println("in show: "+num);
			}
		};
		com1.show(10);
	}

}
