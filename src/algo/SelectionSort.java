package algo;

import java.util.Arrays;

public class SelectionSort {
	
	public static void main(String[] args) {
		//int arr[]= {10,7,6,3,1,2,5,4,8,9};
		int arr[]= { 4, 5, 3, 2, 4, 1 };
		System.out.println("Sorted array : "+Arrays.toString(SelectSort(arr)));
		System.out.println("---------------------------------------------------");
		int arr1[]= { 4, 5, 3, 2, 4, 1 };
		System.out.println("Sorted array : "+Arrays.toString(stable_select_sort(arr1)));
		
		
		
	}
	private static int[] SelectSort(int[] arr)
	{
		for(int i =0;i<arr.length-1;i++)
		{
			int min_index = i;
			for(int j = i+1 ;j<arr.length;j++)
			{
				if(arr[j]<arr[min_index])
				{
					min_index=j;
				}
			}
			int temp = arr[i];
			arr[i]=arr[min_index];
			arr[min_index]=temp;
			System.out.println("Now Array is :: "+Arrays.toString(arr));
		}
		return arr;
	}
	
	private static int[] stable_select_sort(int[] arr)
	{
		
		for(int i=0;i<arr.length;i++)
		{
			int min_index = i;
			for(int j =i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[min_index])
				{
					min_index=j;
				}
			}
			// shifting element to making place for sorted elements
			// 5 4 3 2 1
			// 1 5 4 3 2
			// 1 2 5 4 3
			// 1 2 3 5 4
			// 1 2 3 4 5
			int temp = arr[min_index];
			while(min_index>i)
			{
				arr[min_index]=arr[min_index-1];
				min_index--;
			}
			arr[i]=temp;
			System.out.println("Now Array is :: "+Arrays.toString(arr));
			
		}
		return arr;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
