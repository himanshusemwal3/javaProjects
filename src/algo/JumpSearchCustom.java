package algo;

public class JumpSearchCustom {
	
	
	
	public static void main(String[] args) {
		
		int ar[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
		int ele = 16;
		
		System.out.println(JumpSearch(ar, ele));
		
		
		
	}
	
	
	private static int JumpSearch(int arr[],int ele)
	{
		int step = (int)Math.sqrt(arr.length-1);
		System.out.println("step "+step);
		int prev = 0;
		while(arr[step]<ele)  //5>3
		{
			prev = step;
			step+=(int)Math.sqrt(arr.length-1);
			System.out.println("step "+step);
			if(step>arr.length)
			{
				return -1;
			}
		}
		System.out.println("step "+step);
		System.out.println("prev "+prev);
		for(int i=prev;i<=step;i++)
		{
			if(arr[i]==ele)
			{
				return i;
			}
		}
		return -1;
	}

}
