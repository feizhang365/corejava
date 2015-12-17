package fei.thread.lvl1;
/**
 * Runnable demo test 
 * @author fzh
 *
 */
public class RunnableDemo implements Runnable{
	private int count = 30;
	public static void main(String[] args) {
		RunnableDemo r = new RunnableDemo();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(r);
		t1.start();
		t2.start();
		t3.start();
	}

	@Override
	public void run() {
		for(int i=0;i<30;i++){
			synchronized (this) {
				if(count>0){
	                try{
	                    Thread.sleep(1000);
	                }catch(InterruptedException e){
	                    e.printStackTrace();
	                }
					System.out.println(count--);
				}
			}
		}
	}

}
