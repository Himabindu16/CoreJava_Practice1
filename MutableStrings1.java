
public class MutableStrings1 {

	public static void main(String[] args) {
		
//		Immutable Strings
//		String s=new String("Sachin");
//		s.concat("Tendulkar");
//		System.out.println(s);//Sachin

		
		//MutableStrings
		StringBuffer sb = new StringBuffer("Sachin");
		sb.append("Tendulkar");		//concat=append
		System.out.println(sb);		//SachinTendulkar
		
		//MutableStrings
		StringBuilder sb1 = new StringBuilder("Sachin");
		sb1.append("Tendulkar");	
		System.out.println(sb1);	//SachinTendulkar
		
	}

}
