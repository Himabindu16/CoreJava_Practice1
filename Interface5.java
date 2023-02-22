
interface Demo1
{
	default void disp()
	{
		System.out.println("disp() in interface");
	}
}

interface Demo2 extends Demo1
{
	void show();
}


class Demo3 implements Demo2
{

	@Override
	public void show() {
		System.out.println("show() in class");
		
	}
	
}
public class Interface5 {

	public static void main(String[] args) {
		Demo3 d = new Demo3();
		d.disp();
		d.show();
	}

}
