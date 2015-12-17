package demo.fei.ch1;

public class ClassLoaderTree {

	public static void main(String[] args) {
        ClassLoader loader = ClassLoaderTree.class.getClassLoader(); 
        System.out.println(loader.toString()); 
//        while (loader != null) { 
//            System.out.println(loader.toString()); 
//            loader = loader.getParent(); 
//            System.out.println(">>>"+loader.getParent()); 
//        } 
	}

}
