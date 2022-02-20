package dataStructure;
import java.util.*;
public class LearnCollectionMethods {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("java");
		//list.add(null);
		list.add("c++");
		list.add("python");
		Collections.addAll(list,"go","javascript","ruby");
		System.out.print(list);
		Collections.unmodifiableList(list);
		System.out.println(list.stream().findFirst().get());
		Map<String,String> map  = new HashMap<String,String>();
		map.put("1","One");
		map.put("2","two");
		map.put("3","three");
		map.put("4","four");
		System.out.println(map.entrySet().stream().findFirst().get().getValue());
		
		
		
		
	}

}
