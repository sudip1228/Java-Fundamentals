package thread_project;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class multiplecallablerunner {
//Executor service-waiting for completion of multiple task.If you use more threads, the speed of execution is higher.
//returning the list of output.	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService e= Executors.newFixedThreadPool(1);//when you use 3 threads, the code runs even more faster.
		List<call> l=List.of(new call("sushila"),new call("melisha"),new call("sharmananda"));//note l is a list of object which includes list of call objects or list of threads.
		
		List<Future<String>> f=e.invokeAll(l);//this code waits and collects a list of output.
		//press ctrl+1 and use List<Future<String>> .it is called as future of string.
		for(Future<String> h:f) {
			System.out.println(h.get());
		}
		e.shutdown();

	}

}
