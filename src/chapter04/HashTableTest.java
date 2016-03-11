package chapter04;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new Hashtable<String, Integer>();
		//보통 string을 키로 많이 쓴다.
		
		//map.put("one", new Integer(1));
		map.put("one", 1); //auto boxing
		map.put("two", 2);
		map.put("three", 3);
		
		int i = map.get("one"); //auto unboxing
		System.out.println(i);
		
		map.remove("one");
		System.out.println(map.get("one"));
		if (map.get("one")!=null){
		
		//이름변경: 그 클래스를 쓰고 있는 다른 것들을 다 읽고 다 이름을 변경해준다.
			
		}
		
		//brining key set
		Set<String> s = map.keySet();
		Iterator<String> it = s.iterator();
		while(it.hasNext()){
			String sa = it.next();
			System.out.println(map.get(sa));
		}
	
	}

}
