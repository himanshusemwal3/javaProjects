package java8Features;
import java.util.*;





public class SortByLambda {
	
	public static void main(String[] args) {
		List<Integer> list  = new ArrayList<>();
		list.add(10);
		list.add(15);
		list.add(15);
		list.add(6);
		list.add(4);
		list.add(4);
		//list.add(null);
		
		System.out.println("Before sort "+list);
		Collections.sort(list);
		System.out.println("After Sort"+list);
		//Collections.sort(list,(obj1,obj2)->obj1>obj2?-1:obj1<obj2?1:0);
		//Collections.sort(list,(obj1,obj2)->obj2-obj1);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("After Descending sort"+list);
		

	}

		

}
