package collectionListConcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {
		
		//it is similar to hash map, however its is synchronized
		//stores the value on the basis of  Key, Value
		//Key-->Object, Hash code ---> Value
		//it contains only unique values
		//it cannot store null value and null key through NullPointerException
		Hashtable h1 = new Hashtable();
		h1.put(1, "Rajesh");
		h1.put(2, "Kannan");
		h1.put(3, "Mark");
		
		//create a clone copy/shallow copy
		Hashtable h2 = new Hashtable();
		h2 =(Hashtable) h1.clone();
		
		System.out.println("The values from h1" + h1);
		System.out.println("The values from h2" + h2);
		
		//clear the h1 hash table
		h1.clear();
		System.out.println("The values from h1" + h1);
		System.out.println("The values from h2" + h2);
		
		//contains value():
		
		Hashtable st = new Hashtable();
		st.put("A", "Manual Testing");
		st.put("B", "Automation");
		st.put("C", "Functional");
		
		
		if(st.containsValue("Manual Testing")) {
			System.out.println("Contains Value");		
		}
		
		//Print all values from hash table using Enumeration - elements()
		Enumeration e = st.elements();
		System.out.println("***********Print values from st*********");
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		//get the values from hash table using - entrySet() - Set of hash table values:
		
		System.out.println("****Print values from st using entrySet()**********");
		
		Set s = st.entrySet();
		System.out.println(s);
		
			
		Hashtable st1 = new Hashtable();
		st1.put("A", "Manual Testing");
		st1.put("B", "Automation");
		st1.put("c", "Functional");
		
		//Check both hash tables are equal are not
		if(st.equals(st1))
			System.out.println("both are equal");
		
		//get a value from Key
		System.out.println(st1.get("A"));
		
		//get the hash code of hash table object
		System.out.println("The hash code value of st is:" + st.hashCode());
		
		//Generic
		Hashtable<String, Integer> ht=new Hashtable<String, Integer>();
		
	}

}
