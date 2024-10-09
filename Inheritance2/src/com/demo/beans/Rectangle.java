package com.demo.beans;

public class Rectangle extends Shape{
	private int len, br;

	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rectangle(String c,int len, int br) {
		super(c);
		this.len = len;
		this.br = br;
	}

	public int getLen() {
		return len;
	}

	public void setLen(int len) {
		this.len = len;
	}

	public int getBr() {
		return br;
	}

	public void setBr(int br) {
		this.br = br;
	}

	
	public float calcArea() {
		System.out.println("Area of Rectangle: ");
		return (len + br)*2;
	}
	public float calcPerimeter() {
		System.out.println("Perimeter of Rectangle: ");
		return len*br;
	}
	
	
	@Override
	public String toString() {
		return super.toString()+"Rectangle [len=" + len + ", br=" + br + "]";
	}
	
	
}
