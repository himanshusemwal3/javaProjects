package dataStructure;

public class LinkedListUserDefined {
	
	Node head;
	LinkedListUserDefined(){
		this.head=null;
	}
	private static class Node{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	public void print()
	{
		Node temp = this.head;
		while(temp!=null)
		{
			System.out.print(temp.data+"  -->  ");
			temp=temp.next;
		}
		System.out.print("null");
	}
	public static void main(String args[])
	{	
		
		LinkedListUserDefined list = new LinkedListUserDefined();
		Node first = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		first.next=second;
		second.next=third;
		third.next=fourth;
		list.head=first;
		list.print();
	}

}
