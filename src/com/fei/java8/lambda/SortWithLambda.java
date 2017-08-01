package com.fei.java8.lambda;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SortWithLambda {

	public static void main(String[] args) {
		List<Developer> listDevs = getDevelopers();
		System.out.println("Before Sort:");
		for(Developer developer : listDevs) {
			System.out.println(developer.toString());
		}
		System.out.println("=================");
//		listDevs.sort(new Comparator<Developer>() {
//			@Override
//			public int compare(Developer o1, Developer o2) {
//				return o2.getAge() - o1.getAge();
//			};
//		});
		System.out.println("After Sort:");
		listDevs.sort((Developer o1, Developer o2) -> o1.getAge() - o2.getAge());
		//lambda, valid, parameter type is optional
		listDevs.sort((o1,o2) -> o1.getAge() - o2.getAge());
		listDevs.forEach((developer)->System.out.println(developer));
		System.out.println("=================");
		

	}

	private static List<Developer> getDevelopers(){
		List<Developer> result = new ArrayList<Developer>();
		result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
		result.add(new Developer("alvin", new BigDecimal("80000"), 20));
		result.add(new Developer("jason", new BigDecimal("100000"), 10));
		result.add(new Developer("iris", new BigDecimal("170000"), 55));
		return result;
	}
}
