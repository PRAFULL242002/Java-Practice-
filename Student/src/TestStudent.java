import java.util.Scanner;
public class TestStudent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("1. Add new Student \n2. Delete the Student \n3. Change Student Address \n4. Find Student By id \n5. Display all Student \n6. Exit");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				StudentService.addNewStudent();
				break;
				
			case 2:
				System.out.println("Enter Student id for Deleting: ");
				String did = sc.next();
				boolean s = StudentService.deleteStudent(did);
				if(s)
				{
					System.out.println("Student Deleted");
				}
				else
				{
					System.out.println("Not Found");
				}
				break;
				
			case 3:
				break;
				
			case 4:
				break;
				
			case 5:
				Student[] sarr = StudentService.DisplayStudent();
				for(Student s1:sarr)
				{
					if(s1 != null)
					{
						System.out.println(s1);
					}
					else
					{
						break;
					}
				}
 				break;
				
			case 6:
				break;
				
			default:
				System.out.println("Wrong Choice");
				break;
			}
		}while(choice != 6);
	}

}
