package com.demo.test;


import java.util.Scanner;

import com.demo.beans.GraduateStudent;
import com.demo.beans.MasterStudent;
import com.demo.beans.Student;
import com.demo.service.PersonService;

public class TestInheritanceArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
		System.out.println("1. Accept new data\n2. Delete student\n3. update marks\n");
		System.out.println("4. display all Graduate Student\n5. Display all master student\n6.Find Grade\n7. display all\n8. Exit\n Choice:");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("1. GraduateStudent \n 2. MasterStudent\n 3.Facutly\nchoice:");
			int ch=sc.nextInt();
			PersonService.addNewData(ch);
			break;
		case 2:
			System.out.println("Enter id for deleting student: ");
			int did = sc.nextInt();
			boolean stu = PersonService.deleteData(did);
			if(stu)
			{
				System.out.println("Student Deleted");
			}
			else
			{
				System.out.println("Student not found");
			}
			break;
		case 3:
			System.out.println("Enter student id for updating marks: ");
			int sid = sc.nextInt();
			System.out.println("Enter Updated Marks: ");
			int upmark = sc.nextInt();
			boolean mrk = PersonService.updateMarks(sid, upmark);
			if(mrk)
			{
				System.out.println("Marks Updated");
			}
			else
			{
				System.out.println("Student not found");
			}
			break;
		case 4:
			Student[] sarr=PersonService.displayAll();
			for(Student s1:sarr) {
				if(s1 instanceof GraduateStudent) {
					System.out.println(s1);
				}
			}
			break;
		case 5:
			 sarr=PersonService.displayAll();
			for(Student s1:sarr) {
				if(s1 instanceof MasterStudent) {
					System.out.println(s1);
				}
			}
			break;
			
		case 6:
			System.out.println("Enetr id");
			int id=sc.nextInt();
			float marks=PersonService.findGrade(id);
			if(marks>0) {
				System.out.println("Marks : "+marks);
			}else {
				System.out.println("not found");
			}
			break;
		case 7:
			sarr=PersonService.displayAll();
			for(Student s:sarr) {
				if(s!=null) {
					System.out.println(s);
				}else {
					break;
				}
			}
			
			break;
		case 8:
			System.out.println("Thank you for visiting....");
			sc.close();
			break;
		default:
			System.out.println("Wrong choice");
			break;
		}
		}while(choice!=8);

	}

}
