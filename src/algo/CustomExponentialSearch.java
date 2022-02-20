package algo;

public class CustomExponentialSearch {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int ele = 5;
		System.out.println(ExponentialSearch(arr, ele));
		
	}
	public static int ExponentialSearch(int arr[],int ele)
	{
		int i = 1;
		int n = arr.length;
		while(i<n&&arr[i]<=ele) {
			i=i*2;
		}		
		return BSearch(arr, ele, i/2, Math.min(i, n-1
				));
	}
	public static int BSearch(int arr[],int ele , int low , int high)
	{
	 
		if(low<=high)
		{
			int mid =  low + (high-low) / 2;
			System.out.println(arr[mid]>ele);
			if (arr[mid]==ele)
			{
				return mid ;
			}
			else if(ele>arr[mid])
			{
				return BSearch(arr, ele, mid+1, high);
			}
			else
			{
				return BSearch(arr, ele, low, mid-1);
			}
		}
		return -1;
		
	}
}
