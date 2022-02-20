package java8Features;
import java.util.*;
public class ComparatorInTreeMap {
	
	public static void main(String[] args) {
		
		Map<Integer,String> map = new TreeMap<Integer,String>((obj1,obj2)->obj2-obj1);
		
		
		map.put(100,"Himanshu");
		map.put(200,"Shrikant");
		map.put(300,"Yogesh");
		map.put(400,"Rishi");
		System.out.print(map);
		
	}
}
