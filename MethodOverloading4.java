//import java.io.IOException;
import java.util.Scanner;

class Calculator {
	
	public int add(int num1, int num2) 
	{
		int result = num1 + num2;
		return result;
	}

} 
public class MethodOverloading4{

	public static void main(String[] args) {
		
	//public static void main(String[] args) throws IOException {
		
		//int num1 = System.in.read() - 48;
		//System.out.println(num1);
		//System.out.println(num2);
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
//		int num1 = 4;
//		int num2 = 5;

		Calculator calc = new Calculator();  //calc - reference variable

		int result = calc.add(num1, num2);
				
		System.out.println(result);
		
	}

}
