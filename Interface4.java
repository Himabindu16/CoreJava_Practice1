
interface Demo1
{
	void disp();
	public static final int a=10;
	
}

interface Demo2 extends Demo1
{
	void show();
}

class Demo3 implements Demo2
{

	@Override
	public void disp() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);	
	}

	@Override
	public void show() {
			int a=20;
			int b=10;
			int c=a-b;
			System.out.println(c);		
	}
	
}

public class Interface4 {

	public static void main(String[] args) {
		Demo3 d= new Demo3();
		d.disp();
		d.show();
	}

}
