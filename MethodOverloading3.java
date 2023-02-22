
class Calculator {
	public int add(int num1, int num2) 
	{
		int result = num1 + num2;
		return result;
	}
	
	public double add(int num1, int num2, int num3) //MethodOverloading - Same 
	{
		int result = num1 + num2+ num3;
		return result * 1.0;
	}
}

public class MethodOverloading3 {

	public static void main(String[] args) {
		
		int num1 = 2;
		int num2 = 5;
		int num3 = 3;
		
		Calculator calc = new Calculator();  //calc - reference variable

		int result = calc.add(num1, num2);
		double result1 = calc.add(num1, num2, num3);	
				
		System.out.println(result);
		System.out.println(result1);
	}

}
