package fei.thread.lvl1;

public class ThreadDemo {
	public static void main(String[] args) {
		
		Runnable r = new Runnable() {
			@Override
			public void run() {
				String name = Thread.currentThread().getName();
				int count = 0;
				while(!Thread.interrupted()){
					try{
						Thread.sleep(2000);
					}catch(Exception e) {
						Thread.interrupted();
					}
					System.out.println("Thread :::"+name+":"+count++);
				}
			}
		};
		
		Thread thA = new Thread(r);
		Thread thB = new Thread(r);
		thA.start();
		thB.start();
		
	}
}
