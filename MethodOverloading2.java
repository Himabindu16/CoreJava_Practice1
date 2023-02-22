
class Calculator {
	public int addTwoNumbers(int num1, int num2) 
	{
		int result = num1 + num2;
		return result;
	}
	
	public int addThreeNumbers(int num1, int num2, int num3) 
	{
		int result = num1 + num2+ num3;
		return result;
	}
}

public class MethodOverloading2 {

	public static void main(String[] args) {
		
		int num1 = 2;
		int num2 = 5;
		int num3 = 3;
		
		Calculator calc = new Calculator();  //calc - reference variable

		int result = calc.addTwoNumbers(num1,num2);
		int result1 = calc.addThreeNumbers(num1, num2, num3);
		System.out.println(result);
		System.out.println(result1);
	}

}
