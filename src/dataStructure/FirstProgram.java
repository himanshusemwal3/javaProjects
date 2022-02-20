package dataStructure;
import java.util.*;
public class FirstProgram
{
	public static void main(String[] args) {
		
		LinkedList al=new LinkedList();  
		al.add("Ravi");  
		al.add("Vijay");  
		al.add("Ravi");  
		al.add("Ajay");  
		Iterator<String> itr=al.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}  
		
		
		
		
	}
	
	
	
	
