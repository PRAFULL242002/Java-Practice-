import java.util.Scanner;
public class StudentService {
	static Student[] sarr;
	static int count;
	static {
		sarr = new Student[10];
		sarr[0]= new Student("Abhishek","Pune",89,88,80);
		sarr[1]= new Student("Raj","Mumbai",78,80,90);
		count = 2;
	}
	
	public static void addNewStudent()
	{
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Student id: ");
//		String sid = sc.next();
//		sc.nextLine();
		System.out.println("Enter Student Name: ");
		String sname = sc.nextLine();
		System.out.println("Enter Student Address");
		String saddress = sc.nextLine();
		System.out.println("Enter Marks of m1: ");
		int m1 = sc.nextInt();
		System.out.println("Enter Marks of m2: ");
		int m2 = sc.nextInt();
		System.out.println("Enter Marks of m3: ");
		int m3 = sc.nextInt();
		sarr[count]=new Student(sname,saddress, m1,m2,m3);
		count++;
	}
	
	public static boolean deleteStudent(String did)
	{
		for(int i=0;i<count;i++)
		{
			if(sarr[i].getSid()==did)
			{
				for(int j=i;j<count;j++)
				{
					sarr[j]=sarr[j+1];
				}
				count--;
				return true;

			}
		}
		return false;
	}
	
	public static Student[] DisplayStudent()
	{
		return sarr;
	}
}
