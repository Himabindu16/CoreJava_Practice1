
public class TernaryOperator {

	public static void main(String[] args) {
	
	int n1=89;
	int n2=23;
	int n3=9;
	
	if(n1>n2 && n1>n3)
		System.out.println(n1);
	else if (n2>n3)                          //(n1>n3 && n2>n3)
		System.out.println(n2);	
	else                                  //if(n3>n1 && n3>n2)
		System.out.println(n3); //code reuse
	}

}

