package dataStructure;
import java.util.*;
public class Practice {
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row size ");
		int m = sc.nextInt();
		System.out.println("Enter the column size");
		int n = sc.nextInt();
		System.out.println("Enter the elements in Matrix ");
		int a[][]=new int[m][n];
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				a[i][j]=sc.nextInt();
		//printMatrix(a);
		int sum=0;
		if(m==n)
		{
			// square matrix
			for(int k=0;k<m;k++)
			{
				int ele=diagonalElements(a)[k];
				boolean check=true;
				for(int i=0;i<m;i++)
					for(int j=0;j<n;j++)
						if(i!=j&&a[i][j]==ele)
							check=false;
							
				if(check)
					sum+=ele;
						
				
			}
			
		}
		else
		{	
			// not a square matrix
			int[][] array ;
			if(m>n)
			{
				
				array = new int[m][m];
				for(int i=0;i<m;i++)
					for(int j=0;j<n;j++)
						array[i][j]=a[i][j];
				for(int k=0;k<m;k++)
					array[k][m-1]=1;
				printMatrix(array);
				System.out.println(Arrays.toString(diagonalElements(array)));
				for(int k=0;k<diagonalElements(array).length;k++)
				{
					int ele=diagonalElements(array)[k];
					boolean check=true;
					for(int i=0;i<m;i++)
						for(int j=0;j<m;j++)
							if(i!=j&&array[i][j]==ele)
								System.out.println(ele);
								check=false;
								
					if(check)
						sum+=ele;
							
					
				}
				
			}
			else
			{
				array = new int[n][n];
				for(int i=0;i<m;i++)
					for(int j=0;j<n;j++)
						array[i][j]=a[i][j];
				for(int k=0;k<n;k++)
					array[n-1][k]=1;
				printMatrix(array);
				System.out.println(Arrays.toString(diagonalElements(array)));
				for(int k=0;k<diagonalElements(array).length;k++)
				{
					int ele=diagonalElements(array)[k];
					boolean check=true;
					for(int i=0;i<n;i++)
						for(int j=0;j<n;j++)
							if(i!=j&&array[i][j]==ele)
							{
								System.out.println(ele);
								check=false;
								break;
							}
								
								
								
					if(check)
						sum+=ele;
							
					
				}
			}
			
			
			
			
			
			
		}
		System.out.println("print sum "+sum);
		
		
		
		
	}
	
	static void printMatrix(int a[][])
	{
		int m =a.length;
		int n=a[0].length;
		System.out.println("Rows "+m+" Columns "+n);
		for(int i=0;i<m;i++)
		{
			
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
			
		}	
			
		
	}
	static int[] diagonalElements(int a[][])
	{	
		int d[] = new int[a.length];
		int c1=0;
		int m =a.length;
		int n=a[0].length;
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				if(i==j)
					d[c1++]=a[i][j];
		
		
		return d;
	}

}
