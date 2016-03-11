package chapter04;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class VectorTest02 {

	public static void main(String[] args) {
		List<String> list = new Vector<String>(); //List에 잇는 메소드만 쓸 수 있다.
		
		list.add("Amy");
		list.add("Bob");
		
		list.remove(1);
		int size = list.size();
		//순회1
		for (int i=0; i<size; i++){	
			String s = list.get(i);
			System.out.println(s);
		}
		
	
		Vector<String> vector = new Vector<String>();
		
		//순회2: 옛날 vector의 순회방법
		Enumeration<String> e = vector.elements();
		while(e.hasMoreElements()){
			String s = e.nextElement();
			System.out.println(s);
		}
		
		
		
		
		
		
		
		
	 

	}

}
