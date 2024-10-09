package com.demo.service;
import java.util.Scanner;

import com.demo.beans.Circle;
import com.demo.beans.Rectangle;
import com.demo.beans.Shape;
import com.demo.beans.Triangle;

public class ShapeService {
	static Shape[] sarr;
	static int cnt;
	static {
		sarr = new Shape[5];
		cnt = 0;
	}
	
	public static void acceptData(int choice)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Shape Color: ");
		String color = sc.next();
		switch(choice)
		{
		case 1:
			System.out.println("Enter Base: ");
			int base = sc.nextInt();
			System.out.println("Enter Height: ");
			int height = sc.nextInt();
			System.out.println("Enter Side1: ");
			int s1 = sc.nextInt();
			System.out.println("Enter Side2: ");
			int s2 = sc.nextInt();
			sarr[cnt] = new Triangle(color, base, height, s1, s2);
			break;
			
		case 2:
			System.out.println("Enter Radius: ");
			int radius = sc.nextInt();
			sarr[cnt] = new Circle(color, radius);
			break;
			
		case 3:
			System.out.println("Enter Length: ");
			int len = sc.nextInt();
			System.out.println("Enter Breadth: ");
			int br = sc.nextInt();
			sarr[cnt] = new Rectangle(color, len, br);
			break;
		}
		cnt++;
	}
	
	public static void calculateDetails(int pos)
	{
		System.out.println(pos+" : Area: "+sarr[pos].calcArea());
		System.out.println(pos+" : perimeter: "+sarr[pos].calcPerimeter());
	}
	
	public static Shape[] getAllShapes() {
		return sarr;
	}
	
	
	
}
