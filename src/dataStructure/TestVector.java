package dataStructure;
import java.util.*;
public class TestVector {
	
	public static void main(String[] args) {
		
		
		
		
		Vector<String> v = new Vector<String>();
		v.add("Ayush");
		v.add("Himanshu");
		v.add("Yogesh");
		v.add("Shrikant");
		Iterator<String> itr = v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
