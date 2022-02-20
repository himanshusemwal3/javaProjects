package algo;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class CustomLinearSearch {
	
	
	
	public static void main(String[] args) {
		
		int arr[]= {3,1,5,6,9,2,12,15,13};
		int ele = 23;
		int index= Linear(arr,ele);
		Consumer<Integer> printOutput = i->{
			if(i==-1)
			{
				System.out.println("element not found");
			}
			else
			{
				System.out.printf(
						"element found at index %s and position %s",
						i,i+1
						);
				
			}
		};
		printOutput.accept(index);
		
	}
	
	private static int Linear(int[] arr,int ele)
	{
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==ele)
			{
				return i;
			}
		}
		
		return -1;  
	}
	
	
	private static int Linear1(int[] arr,int ele)
	{
		int next =arr.length-1;
		for(int prev=0;prev<=next;)
		{
			if(arr[prev]==ele)
			{
				return prev;
			}
			if(arr[next]==ele)
			{
				return next;
			}
			
			prev++;
			next--;
		}
		
		return -1;
	}

	
	
	
	
	

}
