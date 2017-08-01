package com.fei.java8.methodref;

import java.util.ArrayList;
import java.util.List;

/**
 * A method reference can be used to point the following types of methods
 * -Static methods
 * -Instance methods
 * -Constructors using new operator (TreeSet::new)
 * @author fzh 81597228@qq.com
 * @date 2017年8月1日 下午4:11:41
 */
public class RefMethodTest {

	public static void main(String[] args) {
	      List<String> names = new ArrayList<String>();
			
	      names.add("Mahesh");
	      names.add("Suresh");
	      names.add("Ramesh");
	      names.add("Naresh");
	      names.add("Kalpesh");
			
	      names.forEach(System.out::println);
	}

}
