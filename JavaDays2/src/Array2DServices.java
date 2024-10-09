import java.util.Scanner;
public class Array2DServices {
	public static void acceptData(int[][] arr) {
		Scanner sc=new Scanner(System.in);
		//arr.length will give number of rows
		for(int i=0;i<arr.length;i++) {
			///arr[i].length will give number of columns
			for(int j=0;j<arr[i].length;j++) {
				System.out.print("enter number"+i+","+j+"---->");
				arr[i][j]=sc.nextInt();
			}
		}
		
	}

	public static void displayData(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			///arr[i].length will give number of columns
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

	public static int addAllNumbers(int[][] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			///arr[i].length will give number of columns
			for(int j=0;j<arr[i].length;j++) {
				sum+=arr[i][j];
			}
			
		}
		return sum;
	}

	public static int[] addrowwise(int[][] arr) {
		int[] sumarr=new int[arr.length];
	
		for(int i=0;i<arr.length;i++) {
			///arr[i].length will give number of columns
			for(int j=0;j<arr[i].length;j++) {
				sumarr[i]+=arr[i][j];
			}
			
		}
		return sumarr;
	}

	public static int[] addcolumnswise(int[][] arr) {
		int[] sumarr=new int[arr[0].length];
		for(int i=0;i<arr[0].length;i++) {
			///arr[i].length will give number of columns
			for(int j=0;j<arr.length;j++) {
				sumarr[i]+=arr[j][i];    
				                   
			}
			
		}
		return sumarr;
	}
	
	public static void findmax(int[][] arr)
	{
		int max=0;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				if(arr[i][j] > max)
				{
					max = arr[i][j];
				}
			}
		}
		System.out.println("Maximum Number is: "+max);
	}
	
	public static void findmin(int[][] arr)
	{
		int min = Integer.MAX_VALUE;  
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				if(arr[i][j] < min)
				{
					min = arr[i][j];
				}
			}
		}
		System.out.println("Minimum Number is: "+min);
	}
	
	public static int[] findminrow(int[][] arr)
	{
		 
		int[] rowmin = new int[arr.length];
		for(int i=0; i<arr.length; i++)
		{
			int min = Integer.MAX_VALUE;
			for(int j=0; j<arr[i].length; j++)
			{
				if(arr[i][j] < min)
				{
					min = arr[i][j];
				}
			}
			rowmin[i] = min;
		}
		return rowmin;
	}
	
	public static int[] findmincolom(int[][] arr)
	{
		int[] colommin = new int[arr.length];
		int j;
		for(int i=0; i<arr[0].length; i++)
		{
			int min = Integer.MAX_VALUE;
			for(j=0; j<arr.length; j++)
			{
				if(arr[j][i] < min)
				{
					min = arr[j][i];
				}
			}
			colommin[j] = min;
		}
		return colommin;
	}

}
