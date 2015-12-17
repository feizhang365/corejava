package fei.thread.lvl1;

public class TwoThreadRace {

	public static void main(String[] args) {
		Thread thA = new Thread(new Runnable() {
			@Override
			public void run() {
				while(Test.i < Integer.MAX_VALUE){
//					try {
//						Thread.sleep(100);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
					Test.one();
				}
			}
		});
		Thread thB = new Thread(new Runnable() {
			@Override
			public void run() {
				while(Test.i < Integer.MAX_VALUE){
//					try {
//						Thread.sleep(100);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
					Test.two();
				}
			}
		});
		
		thA.start();
		thB.start();
		
	}

}


class Test {
    static volatile int i = 0, j = 0;
    static void one() { i++; j++; }
    static void two() {
        System.out.println("i=" + i + " j=" + j);
    }
}