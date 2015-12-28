package fei.quartz.demo;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class QuartzTriggerFileMove {
	
	public static void main(String[] args) throws SchedulerException {
		// builder job
//		JobDetail job = JobBuilder.newJob(QuartzJob.class).withIdentity("testJob","group1").build();
		JobDetail job = JobBuilder.newJob(MoveFile2Des.class).withIdentity("fileMVJob","group1").build();
		// builder trigger
		Trigger trigger = TriggerBuilder.newTrigger().withIdentity("fileMVTrigger","group1").withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(10).repeatForever()).build();
		//scheduler it
		Scheduler scheduler = new StdSchedulerFactory().getScheduler();
		scheduler.start();
		scheduler.scheduleJob(job, trigger);		
	}

}
