package algo;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CustomBinarySearch {
	
	
	
	
	public static void main(String[] args) {
		
		// required sorted array
		int arr[]=IntStream.range(1, 100).toArray();
		//System.out.println(Arrays.toString(arr));
		int ele = 49;
		int index = BinSearch(arr, ele);
		if(index==-1)
		{
			System.out.println("element not found");
		}
		else
		{
			System.out.printf(
					"element found at index %s and position %s",
					index,index+1
					);
			
		}
		
	}

	
	
	private static int  BinSearch(int arr[],int ele )
	{
		int low = 0;
		int high = arr.length-1;
		
		while(low<=high)
		{
			int mid = low +  (high - low)/2;
			if(arr[mid]==ele)
			{
				return mid;
			}
			else if(ele>arr[mid])
			{
				low = mid+1;
			}
			else
			{
				high=mid-1;
			}
		
		}
		return -1;
	}
}
