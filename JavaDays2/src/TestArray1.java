import java.util.Scanner;
public class TestArray1 
{
	public static void main(String[] args)
	{
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do 
		{
			System.out.println("1. Accept Elements\n2. Display Elements\n3. Search Element\n4. Sum of Elements\n5. Prime Numbers\n6. Exit");
			System.out.println("Enter Choice: ");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				ArrayServices.accept(arr);
				break;
			
			case 2:
				ArrayServices.display(arr);
				break;
				
			case 3:
				System.out.println("Enter Searching Element: ");
				int searchele = sc.nextInt();
				boolean val = ArrayServices.search(arr,searchele);
				if(val)
				{
					System.out.println("Element Found");
				}
				else
				{
					System.out.println("Element Not Found\n");
				}
				
			case 4:
				ArrayServices.add(arr);
				break;
				
			case 5:
				int[] primearr = ArrayServices.primenum(arr);
				for(int i=0; i<primearr.length; i++)
				{
					System.out.println(primearr[i]);
				}
				break;
				
			case 6:
				System.exit(0);
			
			default:
				System.out.println("wrong choice....");
				
			}
		}while(choice != 7);
		
	}

}
