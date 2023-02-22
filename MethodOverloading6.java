
class Addition 
{
	void add(int a, float b) {
		float c=a+b;
		System.out.println(c);
	}
	
	float add(int a, int b) {
		float c=a+b;
		System.out.println(c);
		return c;
	}
	
	void add(int a,float b, int c) {
		float r=a+b;
		System.out.println(r);
	}
	
}
public class MethodOverloading6 {

	public static void main(String[] args) {

		Addition a = new Addition();
		a.add(10, 20);
		a.add(10, 20.5f);
		a.add(10, 20, 30);
	}

}
