package chapter04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Amy");
		set.add("Bob");
		set.add("Cindy");
		set.remove("Bob");
		set.add("Dave");
		
		System.out.println(set.contains("Amy")); 
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}
		
		for(String s: set){
			System.out.println(s);
		}
		
		

	}
}
