package com.fei.lang;

public class ClassForNameDemo {

	   public static void main(String[] args) throws InstantiationException, IllegalAccessException {

	     try {
	        // returns the Class object for the class with the specified name
	        Class<?> cls = Class.forName("java.lang.ClassLoader");
	         
	        // returns the name and package of the class
	        System.out.println("Class found = " + cls.getName());
	        System.out.println("Package = " + cls.getPackage());
	        
	        /* creates a new instance of the class represented by this 
	        Class object cls */
	        SubClass1 obj = new SubClass1();
	        Class clz = obj.getClass();
	        Object obj2 = clz.newInstance();
	        System.out.println("Time = " + obj2);
	        
	        ClassLoader cl = Thread.currentThread().getContextClassLoader();
	        System.out.println(cl);
	       System.out.println( ClassLoader.getSystemClassLoader());
	     }
	     catch(ClassNotFoundException ex) {
	        System.out.println(ex.toString());
	     }
	   }
}
