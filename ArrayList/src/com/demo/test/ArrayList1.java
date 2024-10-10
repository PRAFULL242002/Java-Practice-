package com.demo.test;

import java.util.List;
import java.util.ArrayList;

public class ArrayList1{

	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<>();
		lst.add(12);
		lst.add(20);
		lst.add(30);
		System.out.println("index position :"+lst.indexOf(20));
		System.out.println("index position :"+lst.indexOf(20));
		System.out.println("contains :"+lst.contains(20));
		List<Integer> lst1=List.of(11,22,11,3,4,2,3,3,4,5,6,7,8,9,0,11,11,11,11);
		lst1.stream().forEach(System.out::println);
	}

}
