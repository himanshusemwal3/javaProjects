package dataStructure;
import java.util.*;
import java.util.Map.Entry;
public class TestHashTable {
	public static void main(String[] args) {
		Hashtable<Object,Object> hashTable = new Hashtable();
		hashTable.put(100,"Amit");
		hashTable.put(101,"Shrikant");
		hashTable.put(102,"Himanshu");
		//hashTable.put(null,null);
		Set entrySet=hashTable.entrySet();
		for(Object i :entrySet)
		{	
			System.out.println(i);
		}
		//
		System.out.println("------------------------------");
		for(Object i :entrySet)
		{	
			Map.Entry val = (Entry) i;
			System.out.println(val.getKey()+"   "+val.getValue());
		}
		
		System.out.println(hashTable.keySet());
		System.out.println(hashTable.values());
		
		for(Map.Entry m:hashTable.entrySet())
		{
			System.out.println(m.getKey()+"  "+m.getValue());
		}
		
		System.out.println(hashTable.getOrDefault(103,"Not value present related to this index"));
		
	}

}
