package dataStructure;
import java.util.*;
public class TestStack {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("Ayush");
		stack.push("Ravi");
		stack.push("Shrikant");
		stack.push("Yogesh");
		stack.push("Himanshu");
		Iterator<String> itr = stack.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		stack.stream().forEach(i->System.out.println(i));
	}
	
}
