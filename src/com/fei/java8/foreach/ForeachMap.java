package com.fei.java8.foreach;

import java.util.HashMap;
import java.util.Map;
/**
 * foreach Map demo
 * @author fzh 81597228@qq.com
 * @date 2017年7月26日 上午10:36:11
 */
public class ForeachMap {
	public static void main(String[] args) {
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("D", 40);
		items.put("C", 30);
		items.put("E", 50);
		items.put("F", 60);
		//Normal way to loop a Map
		for(Map.Entry<String, Integer> entry: items.entrySet()) {
			System.out.println("Item : " + entry.getKey() + "  Count : " + entry.getValue());
		}
		System.out.println("==================in java8================");
		// In java8 
		items.forEach((k,v) -> System.out.println("item:" + k + "  Count:" + v));
		items.forEach((k,v) -> {
			System.out.println("item:" + k + "  Count:" + v);
			if("E".equals(k)){
				System.out.println("Hello E");
			}
		});
	}
}
