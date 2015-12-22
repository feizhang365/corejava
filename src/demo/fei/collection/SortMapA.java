package demo.fei.collection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMapA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> unsortMap = new HashMap<String, String>();
		unsortMap.put("Z", "z");
		unsortMap.put("B", "b");
		unsortMap.put("A", "a");
		unsortMap.put("C", "c");
		unsortMap.put("D", "d");
		unsortMap.put("E", "e");
		unsortMap.put("Y", "y");
		unsortMap.put("N", "n");
		unsortMap.put("J", "j");
		unsortMap.put("M", "m");
		unsortMap.put("F", "f");
		printMap(unsortMap);
		System.out.println("=====================");
		Map<String,String> sortMap = new TreeMap<String,String>(unsortMap);
		printMap(sortMap);
		
		System.out.println("*********************");
		Map<String, String> userSortMap = new TreeMap<String, String>(
				new Comparator<String>() {
				@Override
				public int compare(String o1, String o2) {
					return o2.compareTo(o1);
				}

		});
		userSortMap.putAll(unsortMap);
		
		printMap(userSortMap);
		
	}

	/**
	 * print map
	 * @param map
	 */
	private static void printMap(Map<String,String> map){
		for(Map.Entry<String, String> entry : map.entrySet()){
			System.out.println("key:"+entry.getKey() +"___value:"+entry.getValue());
		}
		
	}
}
