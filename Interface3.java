
interface Calc
{
	void add();
}
class MyCalc
{
	void sub()
	{
		int a=20;
		int b=30;
		int c=a-b;
		System.out.println(c);
	}
}

class Cal extends MyCalc implements Calc
{
	public void add()
	{
		int a=20;
		int b=30;
		int c=a+b;
		System.out.println(c);
	}
}
public class Interface3 {

	public static void main(String[] args) {
		
		Cal c= new Cal();
		c.add();
		c.sub();
	}

}
