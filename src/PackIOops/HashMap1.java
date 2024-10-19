package PackIOops;

import java.util.HashMap;
import java.util.Hashtable;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Integer, String> ht=new Hashtable<Integer, String>();
		ht.put(7, "Bhaskar");
		ht.put(9, "Baise");
		ht.put(11, "Pushkar");
		ht.put(13, "Pravin");
		
		System.out.println(ht);
		System.out.println(ht.get(11));
		
		
/*		HashMap<Integer, String> obj=new HashMap<Integer, String>();
		obj.put(1, "Shyam");
		obj.put(3, "Radhe");
		obj.put(5, "Priya");
		
		System.out.println(obj);
		System.out.println();
		System.out.println(obj.get(5));
		
	*/	
	}

}
