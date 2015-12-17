package fei.thread.lvl1;

public class HelloThread extends Thread{

		public HelloThread() {
		 
	    }
	 
	    public HelloThread(String name) {
	        this.name = name;
	    }
	 
	    public void run() {
	        for (int i = 0; i < 5; i++) {
	            System.out.println(name + "运行     " + i);
	        }
	    }
	 
	    public static void main(String[] args) {
	    	HelloThread h1=new HelloThread("A");
	    	HelloThread h2=new HelloThread("B");
	        h1.start();
	        h2.start();
	    }
	 
	    private String name;
}
