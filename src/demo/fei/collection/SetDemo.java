package demo.fei.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set setA = new HashSet();
		setA.add("element 1");
		setA.add("element 2");
		setA.add("element 1");
		Iterator it = setA.iterator();
		while(it.hasNext()){
			String ss = (String)it.next();
			if(setA.contains("element 1")){
				System.out.println("xxxxx");
			}
			System.out.println(ss);
			
		}
	}

}
