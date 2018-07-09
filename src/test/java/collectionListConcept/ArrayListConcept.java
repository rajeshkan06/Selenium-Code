package collectionListConcept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ArrayListConcept {

	public static void main(String[] args) {

		//Map<String, Integer> m = new HashMap<String, Integer>();
		
		//HashMap<String, String> m1 = new HashMap<String, String>();
		
		ArrayList<Integer> ar = new ArrayList<Integer>();

		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		ar.add(50);
		ar.add(50);

		System.out.println(ar.size());
		System.out.println(ar.get(4));

		System.out.println("******Using for loop********");
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		// Employee class objects

		Employee e1 = new Employee("Rajesh", 26, "Testing");
		Employee e2 = new Employee("Kannan", 27, "Admin");
		Employee e3 = new Employee("Mark", 29, "Manager");

		// Create ArrayList:

		ArrayList<Employee> ar1 = new ArrayList<Employee>();
		ar1.add(e1);
		ar1.add(e2);
		ar1.add(e3);

		// iterator to traverse the values
		System.out.println("**********Using Iterator***************");
		Iterator<Employee> it = ar1.iterator();
		while (it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);

		}

	}

}
