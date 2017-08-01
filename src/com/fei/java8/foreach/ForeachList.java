package com.fei.java8.foreach;

import java.util.ArrayList;
import java.util.List;
/**
 * foreach List demo
 * @author fzh 81597228@qq.com
 * @date 2017年7月26日 上午10:36:05
 */
public class ForeachList {
	public static void main(String[] args) {
		List<String> items = new ArrayList<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");
		//lambda
		//Output : A,B,C,D,E
		items.forEach(item->System.out.println(item));
		//Output : C
		items.forEach(item->{
			if("C".equals(item)){
				System.out.println(item);
			}
		});
		
		//method reference
		//Output : A,B,C,D,E
		items.forEach(System.out::println);
		
		//Stream and filter
		//Output : B
		items.stream()
			.filter(s->s.contains("B"))
			.forEach(System.out::println);
	}
}
