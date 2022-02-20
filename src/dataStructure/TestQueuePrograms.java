package dataStructure;
import java.util.*;
public class TestQueuePrograms {
	
	
	
	public static void main(String[] args) {
			PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
			queue.add(1);
			queue.add(2);
			queue.add(3);
			//queue.add(null);
			queue.forEach(i->System.out.println(i));
	}

}
