
interface Calc1
{
	void add(int a, int b);
}

interface Calc2
{
	int sub(int a, int b);
}

class MyCal implements Calc1, Calc2
{
	public void add(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	
	public int sub(int a, int b)
	{
		int c=a-b;
		return c;
	}
}


public class Interface1 {

	public static void main(String[] args) {
		
		MyCal c = new MyCal();
		c.add(10, 20);
		System.out.println(c.sub(30, 20));
		
	}

}
