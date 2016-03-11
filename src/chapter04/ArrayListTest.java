package chapter04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		//순회1: for문 사용
		//순회2: iterator사용
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}
		//순회3: for each문 사용
		for(String s: list){
			System.out.println(s);
		}

		
                                                                                                                         	}

}
