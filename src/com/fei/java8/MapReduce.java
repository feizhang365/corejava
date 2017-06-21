package com.fei.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Java8 MapReduce Example
 * @author fzh 81597228@qq.com
 * @date 2017年6月21日 下午5:22:50
 */
public class MapReduce {

	public static void main(String[] args) {
		List<String> stringCollection = new ArrayList<>();
		stringCollection.add("ddd2");
		stringCollection.add("aaa2");
		stringCollection.add("bbb1");
		stringCollection.add("aaa1");
		stringCollection.add("bbb3");
		stringCollection.add("ccc");
		stringCollection.add("bbb2");
		stringCollection.add("ddd1");
		//map 
		stringCollection
	    .stream()
	    .map(String::toUpperCase)
	    .sorted((a, b) -> b.compareTo(a))
	    .forEach(System.out::println);
		//reduce
		Optional<String> reduced =
			    stringCollection
			        .stream().parallel()
			        .map(String::toUpperCase)
			        .sorted()
			        .reduce((s1, s2) -> s1 + "#" + s2);
		
		reduced.ifPresent(System.out::println);
		
	}

}
