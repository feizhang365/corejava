package com.fei.lang;

public class ClassDemo {

	   public static void main(String[] args) {

	     try {
	        ClassDemo cls = new ClassDemo();
	        ClassDemo subcls = new SubClass1(); 
	 
	        // class ClassDemo
	        Class<? extends ClassDemo> c = cls.getClass(); 
	        System.out.println(c);
	        Package pkg = ClassDemo.class.getPackage();
	        System.out.println(pkg.getImplementationVersion());
	        // sub class SubClass1
	        Class c1 = subcls.getClass();
	        System.out.println(c1);
	    
	        // represent a subclass of the specified class object
	        Class retval = c1.asSubclass(c);
	   
	        System.out.println(retval);
	     }
	   
	     catch(ClassCastException e) {
	        System.out.println(e.toString());
	     }
	   }
}
