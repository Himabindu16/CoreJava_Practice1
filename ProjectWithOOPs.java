import java.util.Scanner;

abstract class Shapes
{
	float area;	
	abstract void input();
	
	abstract void compute();
	
	void disp()
	{
		System.out.println("The area is:"+area);
	}
}

class Rectangle extends Shapes
{
	float len;
	float brd;
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the length of the rectangle");
		len = s.nextFloat();
		System.out.println("Please enter the breadth of the rectangle");
		brd = s.nextFloat();
	}
	
	void compute()
	{
		area = len * brd;
	}	
}

class Square extends Shapes
{
	float len;
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the length of the square");
		len = s.nextFloat();
	}
	
	void compute()
	{
		area = len*len;
	}
}

class Circle extends Shapes
{
	float rad;
	final float pi=3.14f;
	void input()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the radius of the circle");
		rad = s.nextFloat();
	}
	
	void compute()
	{
		area = pi*rad*rad;
	} 
}

class Calculate
{	
	void permit(Shapes s)
	{
		s.input();
		s.compute();
		s.disp();		
	}
}


public class ProjectWithOOPs {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();		
		Square s = new Square();		
		Circle c = new Circle();
		Calculate cal = new Calculate();
		cal.permit(r);
		cal.permit(s);
		cal.permit(c);
	}

}
