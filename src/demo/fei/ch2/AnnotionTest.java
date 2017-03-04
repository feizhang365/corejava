package demo.fei.ch2;

import java.lang.reflect.Method;

public class AnnotionTest {

	public static void main(String[] args) {

		AnnotionTest test = new AnnotionTest();
		test.myMethod();
		
	}

	@MyAnno(name="fei",desc="testing annotations")
	public void myMethod(){
		Class<? extends AnnotionTest> cls = this.getClass(); 
		try {
			Method mth = cls.getMethod("myMethod");
			MyAnno anno = mth.getAnnotation(MyAnno.class); 
			System.out.println(anno.name());
			System.out.println(anno.desc());
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block\
			e.printStackTrace();
		} 

	}

}
