import java.util.ArrayList;
import java.util.Collections;//utility class(static/helper methods would be available)

public class Generics6 {

		
		public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(5);
		al.add(20);
		al.add(0);
		al.add(15); 
		System.out.println(al);//[10,5,20,0,15]
		
		Collections.sort(al);//sorting is done in ascending order[0, 5, 10, 15]
		System.out.println(al);
	}
}
