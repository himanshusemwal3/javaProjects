package algo;

public class InterpolationSearchCustom {
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int ele = 10;
		System.out.println(InterpolationSearch(arr, ele,0,arr.length-1));
		
		
	}
	private static int InterpolationSearch(int arr[] ,int ele,int low,int high) {
		int pos ;
		
		if(low<=high&&((ele>=arr[low])&&(ele<=arr[high])))
		{
			pos = low +  (ele-arr[low])*(high-low)/(arr[high]-arr[low]);
			System.out.printf("pos is  %d\n",pos);
			
			if(ele==arr[pos])
			{
				return pos;
			}
			else if(ele<arr[pos]) {
				return InterpolationSearch(arr, ele, low, pos-1);
			}
			else
			{
				return InterpolationSearch(arr, ele, pos+1, high);
			}
			
			
			
		}
			
			
		return -1;
	
	}

}
