
class Addition 
{
	void add(int a, float b) {
		float c=a+b;
		System.out.println(c);
	}
	
	void add(float a, int b) {
		float c=a+b;
		System.out.println(c);
	}
	
}

public class MethodOverloading5 {

	public static void main(String[] args) {
		
		Addition a = new Addition();
		a.add(10, 20);
	}

}
