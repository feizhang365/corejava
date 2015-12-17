package demo.fei.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;
/**
 * HashMap、TreeMap 、LinkedHashMap
 * @author fzh
 * http://stackoverflow.com/questions/1066589/iterate-through-a-hashmap
 */
public class MapDemo {
	public static void main(String[] args) {
		Map mapA = new HashMap();
		mapA.put("key1", "element 1");
		mapA.put("key2", "element 2");
		mapA.put("key3", "element 3");
		Iterator it = mapA.keySet().iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		//Map iterator key and value
		Iterator mesIte = mapA.entrySet().iterator();
		while(mesIte.hasNext()){
			Map.Entry<String, String> en  = (Entry<String, String>) mesIte.next();
			System.out.println(en.getKey()+"::"+en.getValue());
		}
		
		
		//HashMap
		Map m1 = new HashMap();
		m1.put("map", "HashMap");
		m1.put("schildt", "java2");
		m1.put("mathew", "Hyden");
		m1.put("schildt", "java2s");
		System.out.println("HashMap=====");
		System.out.println(m1.keySet()); 
		System.out.println(m1.values()); 
		//TreeMap
		SortedMap sm = new TreeMap();
		sm.put("map", "TreeMap");
		sm.put("schildt", "java2");
		sm.put("mathew", "Hyden");
		sm.put("schildt", "java2s");
		System.out.println("TreeMap=====");
		System.out.println(sm.keySet()); 
		System.out.println(sm.values());
		//LinkedHashMap
		LinkedHashMap lm = new LinkedHashMap();
		lm.put("map", "LinkedHashMap");
		lm.put("schildt", "java2");
		lm.put("mathew", "Hyden");
		lm.put("schildt", "java2s");
		System.out.println("LinkedHashMap=====");
		System.out.println(lm.keySet()); 
		System.out.println(lm.values());
	}
}
