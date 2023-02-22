
class Calculator {
	public int add(int num1, int num2) 
	{
		int result = num1 + num2;
		return result;
	}
}

public class MethodOverloading1 {

	public static void main(String[] args) {
		
		int num1 = 2;
		int num2 = 5;
		
		Calculator calc = new Calculator();  //calc - reference variable
		//int result = num1 + num2; //delegation - It gives someone else to do the job - segregating task
		int result = calc.add(num1,num2);
		
		System.out.println(result);
		
		
	}

}
