package com.fei.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExp {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
		//before java 8
		Collections.sort(names, new Comparator<String>() {
		    @Override
		    public int compare(String a, String b) {
		        return b.compareTo(a);
		    }
		});
		
		// java 8 
		Collections.sort(names,(String a,String b) -> {
			return a.compareTo(b);
		});
		
		names.sort((String a,String b) -> a.compareTo(b));
		// print list
		System.out.println("------------sort string --------------");
		for(String name : names){
			System.out.println(name);
		}
	}

}
