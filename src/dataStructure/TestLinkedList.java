package dataStructure;
import java.util.*;

public class TestLinkedList {
	
	
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Ravi");
		list.add("Avinash");
		list.add("Shrikant");
		list.add("Himanshu");
		list.add("Yogesh");
		list.add(null);
		Iterator<String> itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		// 2nd iterator in reverse Order
		Iterator<String> itr1=list.descendingIterator();
		
		System.out.println("-------------------------------------------------");
		while(itr1.hasNext())
		{
			;System.out.println(itr1.next());
		}
	}
}
