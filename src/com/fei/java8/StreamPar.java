package com.fei.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class StreamPar {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		for(int i = 0;i<1000000;i++){
			double d = Math.random() * 1000;
			list.add(String.valueOf(d));
		}
		long start = System.nanoTime();//start time
		long count = list.stream().parallel().sorted().count();
		long end = System.nanoTime(); //end time
		long ms = TimeUnit.NANOSECONDS.toMillis(end-start);
		System.out.println(ms+"ms" + count);
	}

}
