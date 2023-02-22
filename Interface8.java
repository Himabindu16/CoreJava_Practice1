import java.util.Scanner;

interface Calculator{
	public float add(int a, int b);
}
public class Interface8 {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of a");
		int x=s.nextInt();
		System.out.println("Enter the value of b");
		int y=s.nextInt();
		
		Calculator c =(int a, int b) ->a+b;

		System.out.println(c.add(x, y));
		c.add(x, y);
	}

}
