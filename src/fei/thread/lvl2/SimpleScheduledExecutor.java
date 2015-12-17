package fei.thread.lvl2;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SimpleScheduledExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScheduledExecutorService ses = Executors.newScheduledThreadPool(3);
		ses.scheduleAtFixedRate(new WorkerThread("job1"), 2, 2, TimeUnit.SECONDS);
		//ses.scheduleWithFixedDelay(new WorkerThread("job2"), 1, 1, TimeUnit.SECONDS);
		//ses.scheduleAtFixedRate(new WorkerThread("job1"), 2, 10, TimeUnit.SECONDS);
	}

}
