import java.util.Scanner;
public class ArrayServices {
	public static int accept(int[] arr)
	{
		System.out.println("Enter 10 Number: ");
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Enter Number: ");
			arr[i] = sc.nextInt();
		}
		return 0;
	}
	
	public static void display(int[] arr)
	{
		System.out.println("Array Elements are: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static boolean search(int[] arr, int searchele)
	{
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==searchele)
			{
				return true;
			}
		}
		return false;
	}
	
	public static void add(int[] arr)
	{
		int sum = 0;
		for(int i=0; i<arr.length; i++)
		{
			sum += arr[i];
		}
		System.out.println("Sum of Numbers: "+sum);
	}
	
	private static boolean checkprime(int num) {
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static int[] primenum(int[] arr)
	{
		int cnt = 0;
		int[] primearr = new int[arr.length];
		for(int i=0; i<arr.length; i++)
		{
			boolean ans=checkprime(arr[i]);
			if(ans) {
				primearr[cnt]=arr[i];
				cnt++;
			}
		}
		if(cnt>0) {
			return primearr;
		}
		return null;
		
	}

}
