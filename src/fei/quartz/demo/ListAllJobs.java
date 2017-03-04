package fei.quartz.demo;

import java.util.Date;
import java.util.List;

import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.matchers.GroupMatcher;

public class ListAllJobs {

	public static void main(String[] args) throws SchedulerException {
		Scheduler scheduler = new StdSchedulerFactory().getScheduler();
		System.out.println(">>>>>>"+scheduler.getJobGroupNames());
    	
		   for (String groupName : scheduler.getJobGroupNames()) {

			     for (JobKey jobKey : scheduler.getJobKeys(GroupMatcher.jobGroupEquals(groupName))) {
							
				  String jobName = jobKey.getName();
				  String jobGroup = jobKey.getGroup();
							
				  //get job's trigger
				  List<Trigger> triggers = (List<Trigger>) scheduler.getTriggersOfJob(jobKey);
				  Date nextFireTime = triggers.get(0).getNextFireTime(); 
	
					System.out.println("[jobName] : " + jobName + " [groupName] : "
						+ jobGroup + " - " + nextFireTime);
	
				  }

		    }
	}

}
