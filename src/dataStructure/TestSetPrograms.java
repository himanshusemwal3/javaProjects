package dataStructure;
import java.util.*;
public class TestSetPrograms {
	
	
	
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>(); // not maintaining insertion order
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(1);
		set.add(2);
		System.out.println(set);
		set.forEach(i->System.out.println(i));
		System.out.println("----------------------------");
		LinkedHashSet<Integer> linkedSet = new LinkedHashSet<Integer>();  // maintain insertion order
		linkedSet.add(1);
		linkedSet.add(2);
		linkedSet.add(3);
		linkedSet.add(5);
		linkedSet.add(4);
		linkedSet.add(1);
		linkedSet.add(2);
		linkedSet.forEach(i->System.out.println(i));
		System.out.println("----------------------------");
		TreeSet<Integer> treeSet = new TreeSet<Integer>(); //maintain ascending order
		treeSet.add(5);
		treeSet.add(4);
		treeSet.add(3);
		treeSet.add(2);
		treeSet.add(1);
		treeSet.forEach(i->System.out.println(i));
		treeSet.pollFirst();
		
		System.out.println("----------------------------");
		
		
		
		Set<Integer> s1 = new TreeSet<Integer>();
		TreeSet<Integer> s2 = new TreeSet<Integer>();
		
	}

}
