import java.util.Scanner;

interface Calculator
{
	void add();
	void sub();

}

class MyCalculator1 implements Calculator
{
	public void add()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the 1st number to add");
		int a = s.nextInt();
		System.out.println("Please enter the 2nd number to add");
		int b = s.nextInt();
		int c = a+b;
		System.out.println(c);

	}
	public void sub() {

		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the 1st number to sub");
		int a = s.nextInt();
		System.out.println("Please enter the 2nd number to sub");
		int b = s.nextInt();
		int c = a-b;
		System.out.println(c);

	}
}
	
class MyCalculator2 implements Calculator
{
	public void add()
	{
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}
	
	public void sub() 
	{
		int a = 20;
		int b = 10;
		int c = a-b;
		System.out.println(c);

	}	
	
}

class Cal
{
	public void permit(Calculator cl)
	{
		cl.add();
		cl.sub();
	}
}


public class Interface1 {

	public static void main(String[] args) {
		
		MyCalculator1 c1 = new MyCalculator1();
		MyCalculator2 c2 = new MyCalculator2();
		
		Cal cl = new Cal();
		cl.permit(c1);
		cl.permit(c2);
	}

}
