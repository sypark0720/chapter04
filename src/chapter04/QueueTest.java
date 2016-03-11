package chapter04;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		
		queue.offer("Amy");
		queue.offer("Bob");
		queue.offer("Cindy");
		
		String s = queue.poll();
		System.out.println(s);
		System.out.println(queue.size());
		
		queue.poll();
		queue.poll();
		System.out.println(queue.size());

	}

}
