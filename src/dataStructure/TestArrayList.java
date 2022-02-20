package dataStructure;
import java.util.*;

public class TestArrayList {
	public static void main(String[] args) {
		
		
		ArrayList<String> list = new ArrayList<>();
		list.add("Ravi");
		list.add("Shrikant");
		list.add("Himanshu");
		list.add("Yogesh");
		list.add(null);
		
		
		
		
		// Using Iterator interface to iterate over ArrayList
		Iterator<String> itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		System.out.println("------------------------------------------------");
		//using forEach loop
		for(String i:list)
		{
			System.out.println(i);
		}
		System.out.println("------------------------------------------------");
		// using lambda expression for each
		list.stream().forEach(i->System.out.println(i));
		System.out.println("------------------------------------------------");	
		
		
		ArrayList<Object> list2 = new ArrayList<Object>();
		list2.add(2);
		list2.add("Two");
		list2.add(1.34);
		list2.forEach(i->System.out.println(i));
		System.out.println("------------------------------------------------");
		
		
		
		
		ArrayList<String> ar1 = new  ArrayList<String>();
		ar1.add("first");
		ar1.add("Second");
		ArrayList<String> ar2 = new  ArrayList<String>();
		ar2.add("third");
		ar2.add("first");
		ar2.add("fourth");
		ar1.addAll(ar2);
		ar1.stream().forEach(i->System.out.println(i));
		ar1.removeIf(i->i.contains("first"));
		System.out.println("------------------------------------------------");
		
		ar1.stream().forEach(i->System.out.println(i));
		ListIterator<String> lisitr = ar1.listIterator();
		
		
		
		
		ArrayList<Integer> newList = new ArrayList<Integer>();
		newList.add(1);
		newList.add(2);
		newList.add(3);
		newList.add(4);
		newList.add(5);
		ListIterator<Integer> newListIterator=newList.listIterator();
		while(newListIterator.hasNext())
		{
			newListIterator.next();
		}
		while(newListIterator.hasPrevious())
		{
			System.out.println(newListIterator.previous());
		}
		
		Integer[] array = newList.toArray(new Integer[newList.size()]);  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
			
}
