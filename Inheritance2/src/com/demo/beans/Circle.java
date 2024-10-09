package com.demo.beans;

public class Circle extends Shape{
	private int radius;
	static final float pi=3.142f;
	
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Circle(String c,int radius) {
		super(c);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRedius(int radius) {
		this.radius = radius;
	}

	
	public float calcArea() {
		System.out.println("Area of Circle: ");
		return pi*radius*radius;
	}
	public float calcPerimeter() {
		System.out.println("Perimeter of Circle: ");
		return 2*pi*radius;
	}
	
	
	@Override
	public String toString() {
		return super.toString()+"Circle [radius=" + radius + "]";
	}
	
	
	
}
