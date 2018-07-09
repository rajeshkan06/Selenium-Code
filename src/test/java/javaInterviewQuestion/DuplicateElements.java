package javaInterviewQuestion;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;


public class DuplicateElements {

	public static void main(String[] args) {
		
		String languages[] = {"Java", "JS", "Perl", "PHP", "Java", "PHP"};
		
		//1. Compare each element using for loop:
		
		for(int i=0; i<languages.length; i++) {
			for(int j=i+1; j<languages.length; j++) {
				if(languages[i].equals(languages[j]))
					System.out.println("Duplicate element is "+languages[i]);
			}
		}
		
		//2. Using HashSet:
		
		Set<String> store = new HashSet<String>();
		for(String language : languages) {
			if(store.add(language) == false) {
				System.out.println("Duplicate element is "+language);
			}
		}
		
		//3. Using HashMap:
		
		Map<String, Integer> storeMap = new HashMap<String, Integer>();
		for(String language : languages) {
			Integer count = storeMap.get(language);
			if(count == null) {
				storeMap.put(language, 1);
			}
			else {
				storeMap.put(language, ++count);
			}
		}
		
		//get values from the HashMap
		
		Set<Entry<String, Integer>> entrySet = storeMap.entrySet();
		for(Entry<String, Integer> entry : entrySet) {
			if(entry.getValue()>1) {
				System.out.println("Dulpicate element is " + entry.getKey());
			}
			
		}
		
		
		
		

	}

}
