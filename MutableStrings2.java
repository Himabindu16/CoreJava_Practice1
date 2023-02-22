
public class MutableStrings2 {

	public static void main(String[] args) {
		
		
//		//Mutable Strings
//		String s1=new String("sachin");
//		String s2=new String("sachin");
//		System.out.println(s1==s2);		//false
//		System.out.println(s1.equals(s2));	//true
//		System.out.println("*********************************************");
		
		
		//Immutable Strings
		StringBuffer sb1=new StringBuffer("sachin");
		StringBuffer sb2=new StringBuffer("sachin");
		System.out.println(sb1==sb2);	//compares the reference =>false
		System.out.println(sb1.equals(sb2));	//false
		
		System.out.println("**********************************************");
		
		//Immutable Strings
		StringBuilder sb3=new StringBuilder("sachin");
		StringBuilder sb4=new StringBuilder("sachin");
		System.out.println(sb3==sb4);	//compares the reference =>false
		System.out.println(sb3.equals(sb4));	//false
		
	}

}
