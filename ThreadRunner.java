package thread_project;


/*states of thread
 * NEW...created a thread.thread is ready but not run.
 * RUNNABLE...ready to run but other thread is being executed.waiting for chance to run.
 * RUNNING...executing the thread.running in a particular time.
 * BLOCKED/WAITING...waiting for external service or resources to come or waiting for some data which is required to execute this thread.
 * TERMINATED/DEAD..thread is completed.eg task 1 is done in the following example.
 */
 
class task2 implements Runnable {

	@Override
	public void run() {
		System.out.println("task2");
		for(int i=0;i<10;i++)
		{
			
			System.out.println("task 2 "+i);
		}
		System.out.println("task2 done");
		
	}
	
}

class task1 extends Thread{
	public void run() {
		System.out.println("task1");
		for(int i=0;i<5;i++)
		{
			System.out.println("task 1 "+i);
		}
		System.out.println("task1 done");
	}
}
public class ThreadRunner {

	public static void main(String[] args) throws InterruptedException {//all task 3 are running parallely which is big advantage of thread.
		task1 t= new task1();
		t.start();//runs thread
		t.setPriority(1);//priority is just a request.the request might or might not be accepted.10 is max.5 is normal and it is default.1 is min.
		//t.run();//doesnot run as a thread but run as a normal method.
		
	
		task2 t2= new task2();//runnable 
		Thread thread= new Thread(t2);
		thread.start();
		thread.setPriority(10);
		
		t.join();//throws exception.always execute task 1 first before any other threads.
		thread.join();//task 3 is completed only after execution of both task 1 and task 2.it is confirmed.here task1 and task2 run parallel.
		//t.sleep(10000);//thread sleeps for 10  seconds.1 second=1000 miliseconds.
		//t.yield();//just a request which might not be accepted.it is static method in thread class.it yeids for other thread and wait for excecution.
		
		//executor service controls the threads.It determines which thread to execute on a give situation.
		
		
		
		System.out.println("task3");
		for(int i=0;i<5;i++)
		{
			System.out.println("task 3 "+i);
		}

		System.out.println("task3 done");
	}

}
