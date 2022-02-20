package dataStructure;

import java.util.ArrayList;

public class UserDefinedStack<E> {
	
	ArrayList<E> arr;
	int size;
	int top;
	UserDefinedStack(int size)
	{
		arr= new ArrayList<>();
		this.size=size;
		top=-1;
	}
	public void push(E ele)
	{	
		if(top==this.size-1)
		{
			System.out.println("stack overflow!!!!");
			return;
		}
		else
		{
			arr.add(ele);top=top+1;
			System.out.println(ele+" pushed to stack ");
		}
		
	}
	public E pop()
	{
		if(top==-1)
		{
			System.out.println("stack underflow!!!!");
			return null;
		}
		else
		{	
			E ele =arr.get(top);
			arr.remove(top);
			return ele;
		}
	}
	public E peek() {
		return arr.get(top);
	}
	
	public static void main(String[] args) {
		UserDefinedStack<Integer> stack = new UserDefinedStack<>(10);
		for(int i=1;i<=12;i++) {stack.push(i);}
		System.out.println(stack.pop());
	}

}
