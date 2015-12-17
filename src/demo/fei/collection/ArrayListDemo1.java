package demo.fei.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List listA = new ArrayList();
		listA.add("string 1");
		listA.add("String 2");
		listA.add(0, "String 0");
		System.out.println(listA);
		
		//access via index
//		String element0 = (String)listA.get(0);
//		String element1 =  (String)listA.get(1);
//		String element2 =  (String)listA.get(2);
//		System.out.println(element0);
//		System.out.println(element1);
//		System.out.println(element2);
		
		Iterator it = listA.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}	
