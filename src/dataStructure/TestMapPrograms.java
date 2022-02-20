package dataStructure;

import java.util.*;
import java.util.Map.Entry;

public class TestMapPrograms {
	
	
	
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(1,"1st value");
		map.put(2.0,"2nd value");
		map.put("third","3rd value");
		map.put(null,null);
		System.out.println(map.entrySet());
		System.out.println(map.values());
		System.out.println(map.keySet());
		System.out.println(map.get(1));
		
		
		Set setentry = map.entrySet();
		Iterator itr = setentry.iterator();
		while(itr.hasNext())
		{
			Map.Entry entry =  (Entry) itr.next();
			System.out.println(entry.getKey()+"   "+entry.getValue());
			
		}
		
		Map<Integer,String> map1 = new HashMap<Integer,String>();
		map1.put(102,"Rahul");
		map1.put(101,"Amit");
		map1.put(100,"Ajay");
		map1.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(i->System.out.println(i));
		System.out.println("-----------------------------------------------------------------------------");
		map1.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);

		System.out.println("-----------------------------------------------------------------------------");
		map1.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(i->System.out.println(i));

		System.out.println("-----------------------------------------------------------------------------");
		map1.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
		
		
		TreeMap<Integer,String> treeMap = new TreeMap<Integer,String>();
		treeMap.put(102,"Rahul");
		treeMap.put(101,"Amit");
		treeMap.put(100,"Ajay");
		System.out.println(treeMap.descendingMap());
		
		
		
		
		
	}

}
