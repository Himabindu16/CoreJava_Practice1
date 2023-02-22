
class A	extends Object	//super
{
	int i=5;
	public void show() 
	{
		System.out.println("In A Show");
	}
}

class B extends A		//sub
{
	
	int i=7;	//As we declared obj for B so result is 7 if this is in comment int i=7 then we get 5 
	public void printIValue() {
		int i=9;
		System.out.println(i);
	}
}

public class Inheritance4 
{
	public static void main(String[] args) 
	{
		B obj = new B();                                                                                                                              
		obj.show();
		//System.out.println(obj.i);
		obj.printIValue();
	}

}
