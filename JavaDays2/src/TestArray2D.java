import java.util.Scanner;
public class TestArray2D {

	public static void main(String[] args) {
		int[][] arr = new int[3][4];
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("1. accept data\n2. display data\n3. add all numbers\n4. Add rowwise\n");
			System.out.println("5. add columnwise\n6. find maximum\n7. find minimum\n8. find minimim row wise\n");
			System.out.println("9. find minimum column wise\n10. exit\nchoice: ");
			choice = sc.nextInt();
			switch (choice) {
				case 1:
					Array2DServices.acceptData(arr);
					break;
				case 2:
					Array2DServices.displayData(arr);
					break;
				case 3:
					int sum = Array2DServices.addAllNumbers(arr);
					System.out.println("Sum of all values: " + sum);
					break;
				case 4:
					int[] sumarr = Array2DServices.addrowwise(arr);
					for (int i = 0; i < sumarr.length; i++) {
						System.out.println("Sum of row " + i + ":  " + sumarr[i]);
					}
					break;
				case 5:
					sumarr = Array2DServices.addcolumnswise(arr);
					for (int i = 0; i < arr[0].length; i++) {
						System.out.println("Sum of row " + i + ":  " + sumarr[i]);
					}
					break;
					
				case 6:
					Array2DServices.findmax(arr);
					break;
					
				case 7:
					Array2DServices.findmin(arr);
					break;
					
				case 8:
					int[] rowarr = Array2DServices.findminrow(arr);
					for(int i=0; i<arr.length; i++)
					{
						System.out.println("Minimum of Row"+i+":"+rowarr[i]);
					}
					break;
					
				case 9:
					int[] colomarr = Array2DServices.findmincolom(arr);
					for(int i=0; i<arr[0].length; i++)
					{
						System.out.println("Minimum of Row"+i+":"+colomarr[i]);
					}
					break;
					
				case 10:
					System.out.println("Thank you for visiting....");
					// System.gc();
					System.exit(0);
				default:
					System.out.println("wrong choice....");
			}
		} while (choice != 10);

	}

}
