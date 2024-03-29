package _04_Thread_Pool;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Worker implements Runnable {
	ConcurrentLinkedQueue<Task> taskQueue;
	
	Worker(ConcurrentLinkedQueue<Task> taskQueue) {
		taskQueue = new ConcurrentLinkedQueue<Task>();
	}
	
	@Override
	public void run() {
		while(taskQueue.size()>0) {
			taskQueue.remove().perform();
		}
		
	}


}
