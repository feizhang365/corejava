package demo.fei.collection;

import java.util.EnumMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
		tmap.put(10, "语文");
		tmap.put(3, "英语");
		tmap.put(2, "数学");
		tmap.put(4, "政治");
		tmap.put(5, "历史");
		tmap.put(6, "地理");
		tmap.put(7, "生物");
		tmap.put(8, "化学");
		for(Entry<Integer, String> entry : tmap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		System.out.println("===================");
		EnumMap<Course, String> map = new EnumMap<Course, String>(Course.class);
		map.put(Course.ONE, "语文");
		map.put(Course.ONE, "政治");
		map.put(Course.TWO, "数学");
		map.put(Course.THREE, "英语");
		for(Entry<Course, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
	
	public enum Course{
		ONE,
		TWO,
		THREE
	}
}
