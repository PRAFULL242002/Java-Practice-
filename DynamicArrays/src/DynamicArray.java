import java.util.Scanner;

public class DynamicArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][];
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Enter number in columns in row: "+i);
			int c = sc.nextInt();
			arr[i] = new int[c];	
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.println("Enter number for row"+i+"Column"+j);
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
