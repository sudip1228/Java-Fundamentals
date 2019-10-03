package thread_project;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class task extends Thread{
	int n;
	public task(int n)
	{
		this.n=n;
	}
	public void run() {
		System.out.println("task start "+n);
		
	for(int i=n*1;i<n*1+5;i++)
	{
		System.out.println("task "+n+" "+i);
	}

	System.out.println("task done "+n);
	}
}


public class executorservice_runner {

	public static void main(String[]args) {
		//executor service controls the threads.It determines which thread to execute on a give situation.
		ExecutorService e= Executors.newFixedThreadPool(3);//runs multiple thread at a time.
		//ExecutorService e= Executors.newFixedThreadPool(3);..It means the 3 threads are running parallel or randomly but the other remaining threads(i.e 1) are running and ending like single thread..
		//it means at maximum 3 threads are active at a time and other threads are waiting at that particular time.
		//ExecutorService e= Executors.newSingleThreadExecutor();//able to run only one thread at a time.
		//eg.each task1 is started and completed, and then after that other task2 is started and completed.Similarly, it occurs to every thread.
		//task1 t= new task1();..optional.
		//e.execute(t);
		e.execute(new task(1));//runs task 1.it is short cut than above.
		e.execute(new task(2));
		e.execute(new task(3));
		e.execute(new task(4));
		//e.execute(new Thread(new task2()));//runs task 2 which implements runnable interface.it is short cut.
		/*
		System.out.println("task 3 started");
		
		System.out.println("task3");
		for(int i=0;i<5;i++)
		{
			System.out.println("task 3 "+i);
		}

		System.out.println("task3 done");
	
*/
		e.shutdown();
		
		
	}
	
}
