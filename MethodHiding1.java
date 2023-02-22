
class Telusko
{
	public static void disp()
	{
		System.out.println("Telusko is parent");
	}
}

class Alien extends Telusko
{
	public static void disp()
	{
		System.out.println("Alien is telusko");
	}
}

public class MethodHiding1 
{

	public static void main(String[] args) 
	{
//		Alien a=new Alien();
//		a.disp();
		Telusko t= new Alien();
		t.disp();
		
	}

}
