package com.fei.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * With Java 8, Collection interface has two methods to generate a Stream −
 * stream() − Returns a sequential stream considering collection as its source.
 * parallelStream() − Returns a parallel Stream considering collection as its source.
 * 
 * @author fzh 81597228@qq.com
 * @date 2017年7月31日 上午11:27:04
 */
public class StreamTest {

	public static void main(String[] args) {
		List<String> strs = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		List<String> filtered = strs.stream().filter(str -> !str.isEmpty()).collect(Collectors.toList());
		filtered.forEach(System.out::println);
		
	}

}
