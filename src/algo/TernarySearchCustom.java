package algo;

public class TernarySearchCustom {
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int ele = 1;
		System.out.println("\n"+TernarySearch(arr, ele,0,arr.length-1));

		
		
		
	}
	
	private static int TernarySearch(int arr[],int ele,int low,int high)
	{
		
		while(low <= high)
		{
			int mid1 = low + (high-low)/3;
			int mid2 = high -(high-low)/3;
			System.out.printf("\nlow is %d high is %d mid1 is %d and mid2 is %d",low,high,mid1,mid2);
			if(ele==arr[mid1])
			{
				return mid1;
			}
			else if (ele==arr[mid2])
			{
				return mid2;
			}
			else if(ele<arr[mid1])
			{
				high=mid1-1;
			}
			else if(ele>arr[mid2]) {
				
				low =mid2+1;
				
			}
			else {
				low = mid1+1;
				high=mid2-1;
			}
		
		}
		return -1;
			
		
		
	}

}
