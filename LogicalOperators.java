
public class LogicalOperators {

	public static void main(String[] args) {
	
		int a=10;
		int b=10;
		//OR
		System.out.println(a==b||a>b||a<b);
		System.out.println(a!=b||a>b||a<b);
		System.out.println();

		//AND
		System.out.println(a==b&&a>=b);
		System.out.println(a==b&&a>=b&&a>b);
		System.out.println();
		
		//NOT
		System.out.println(!true);
		System.out.println(!false);
	}

}
