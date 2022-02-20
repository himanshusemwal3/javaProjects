package java8Features;
import java.util.*;
public class ComparatorInTreeSet {
	
	
	
	public static void main(String[] args) {
		
		Set<Integer> set = new TreeSet<Integer>((obj1,obj2)->obj2-obj1); // Descending order
		set.add(15);
		set.add(16);
		set.add(17);
		set.add(20);
		set.add(10);
		set.add(9);
		set.add(8);
		System.out.println(set);
	}

}
